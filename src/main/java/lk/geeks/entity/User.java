package lk.geeks.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class User implements UserDetails {

    @Id
    private
    String uname;

    private String password;

    private boolean isApprove;

    private String memberType;

    private String nic;


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }
    @JsonIgnore
    @Override
    public String getUsername() {
        return null;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(boolean isApprove) {
        this.isApprove = isApprove;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public User(String uname, String password, boolean isApprove, String memberType, String nic) {
        this.uname = uname;
        this.password = password;
        this.isApprove = isApprove;
        this.memberType = memberType;
        this.nic = nic;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", isApprove='" + isApprove + '\'' +
                ", memberType='" + memberType + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
