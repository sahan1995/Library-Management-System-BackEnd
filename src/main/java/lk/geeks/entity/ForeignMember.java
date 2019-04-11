package lk.geeks.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ForeignMember {

    @Id
    private
    String NIC;
    private String fullname;
    private String gender;
    private String email;
    private String dob;
    private String telphone;
    private String country;
    private String address;
    private boolean isApprove;

    public ForeignMember(String NIC, String fullname, String gender, String email, String dob, String telphone, String country, String address, boolean isApprove) {
        this.NIC = NIC;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.telphone = telphone;
        this.country = country;
        this.address = address;
        this.isApprove = isApprove;
    }

    public ForeignMember() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }

    @Override
    public String toString() {
        return "ForeignMember{" +
                "NIC='" + NIC + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", telphone='" + telphone + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", isApprove=" + isApprove +
                '}';
    }
}

