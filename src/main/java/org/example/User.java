package org.example;

public class User {
    public String fname  ;
    public String lname ;
    public String email ;
    public String password ;
    public String phoneNo ;

    public User(String fname, String lname, String email, String password,String phoneNo) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.phoneNo =phoneNo ;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
