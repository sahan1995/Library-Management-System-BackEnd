package lk.geeks.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


public class LocalMemberDTO {


    private
    String NIC;

    private String fname;
    private String mname;
    private String lname;
    private String telephone;
    private String gender;
    private String dob;
    private String email;
    private String address;


    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public LocalMemberDTO(String NIC, String fname, String mname, String lname, String telephone, String gender, String dob, String email, String address) {
        this.NIC = NIC;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.telephone = telephone;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public LocalMemberDTO() {
    }

    @Override
    public String toString() {
        return "LocalMemberDTO{" +
                "NIC='" + NIC + '\'' +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
