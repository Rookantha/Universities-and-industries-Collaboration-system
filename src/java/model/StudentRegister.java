/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ISURU
 */
public class StudentRegister {
    
      private String userType;
      private String fullName;
      private String subject;
      private String univercity;
      private String email;
      private String userName;
      private String password;
      private String pswRepeat;
      private String discription;
      
      public StudentRegister(){
      
      }

    public StudentRegister(String userType, String fullName, String subject, String univercity, String email, String userName, String password, String pswRepeat, String discription) {
        this.userType = userType;
        this.fullName = fullName;
        this.subject = subject;
        this.univercity = univercity;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.pswRepeat = pswRepeat;
        this.discription = discription;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPswRepeat() {
        return pswRepeat;
    }

    public void setPswRepeat(String pswRepeat) {
        this.pswRepeat = pswRepeat;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "StudentRegister{" + "userType=" + userType + ", fullName=" + fullName + ", subject=" + subject + ", univercity=" + univercity + ", email=" + email + ", userName=" + userName + ", password=" + password + ", pswRepeat=" + pswRepeat + ", discription=" + discription + '}';
    }
      
      
}