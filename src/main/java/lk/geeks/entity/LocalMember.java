package lk.geeks.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocalMember {

    @Id
    private
    String NIC;

    private String fullname;
    private String telephone;
    private String gender;
    private String dob;
    private String email;
    private String address;


    public LocalMember(String NIC, String fullname, String telephone, String gender, String dob, String email, String address) {
        this.NIC = NIC;
        this.fullname = fullname;
        this.telephone = telephone;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public LocalMember() {
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LocalMember{" +
                "NIC='" + NIC + '\'' +
                ", fullname='" + fullname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
