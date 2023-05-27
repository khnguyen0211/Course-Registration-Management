/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.privateclassdata;

import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class PrivateData {
    protected String personId;
    protected String fullName;
    protected Date birthday;
    protected String studentAddress;
    protected String email;
    protected String phoneNumber;
    
    public PrivateData() {}

    public PrivateData(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }
    
    public PrivateData(String personId, String fullName, Date birthday, String studentAddress, String email, String phoneNumber) {
        this.personId = personId;
        this.fullName = fullName;
        this.birthday = birthday;
        this.studentAddress = studentAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
}
