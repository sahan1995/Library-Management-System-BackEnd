package lk.geeks.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ForeignMember {

    @Id
    private
    String NIC;
    private String fname;
    private String mname;
    private String lname;
    private String gender;
    private String email;
    private String dob;
    private String telphone;
    private String country;
    private String address;
    private boolean isApprove;

    public ForeignMember(String NIC, String fname, String mname, String lname, String gender, String email, String dob, String telphone, String country, String address, boolean isApprove) {
        this.NIC = NIC;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.telphone = telphone;
        this.country = country;
        this.address = address;
        this.isApprove = isApprove;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ForeignMember() {
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
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
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

