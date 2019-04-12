package lk.geeks.service.impl;

import lk.geeks.dto.ForeignMemberDTO;
import lk.geeks.dto.LocalMemberDTO;
import lk.geeks.dto.LoginDetailDTO;
import lk.geeks.dto.UserDTO;
import lk.geeks.entity.User;
import lk.geeks.repostitory.UserRepository;
import lk.geeks.service.ForeignMemberService;
import lk.geeks.service.LocalMemberService;
import lk.geeks.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ForeignMemberService foreignMemberService;

    @Autowired
    private LocalMemberService localMemberService;
    @Override
    public boolean save(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);

        userRepository.save(user);
        return true;
    }

    @Override
    public LoginDetailDTO login(String uname, String password) {

        Optional<User> userOpt = userRepository.findById(uname);

        if(!userOpt.isPresent()){
            return null;
        }

        User user = userOpt.get();
        if(user.getPassword().equals(password) && user.getIsApprove()==true){
            if(user.getMemberType().equals("local")){
                LocalMemberDTO localMemberDTO = localMemberService.findById(user.getNic());
                LoginDetailDTO loginDetailDTO = new LoginDetailDTO(localMemberDTO.getNIC(),localMemberDTO.getFullname(),user.getMemberType());
                return loginDetailDTO;

            }else{
                ForeignMemberDTO foreignMemberDTO= foreignMemberService.findById(user.getNic());
                LoginDetailDTO loginDetailDTO = new LoginDetailDTO(foreignMemberDTO.getNIC(),foreignMemberDTO.getFullname(),user.getMemberType());
                return loginDetailDTO;
            }
        }else {
            return null;
        }
    }

    @Override
    public boolean approveMemebr(String NIC) {
        List<User> users = userRepository.findAll();


        users.forEach(user -> {
            if(user.getNic().equals(NIC)){
                user.setIsApprove(true);
                return;
            }
        });

        return true;
    }
}
