package lk.geeks.service;

import lk.geeks.dto.LoginDetailDTO;
import lk.geeks.dto.UserDTO;

public interface UserService {


    boolean save(UserDTO userDTO);

    LoginDetailDTO login(String uname, String password);


}
