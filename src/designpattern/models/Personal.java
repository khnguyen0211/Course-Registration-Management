/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.models;

import designpattern.privateclassdata.PrivateData;
import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class Personal {
    private PrivateData data = new PrivateData();

    public Personal() {
    }
    
    public Personal(String fullName, String email) {
        data = new PrivateData(fullName, email);
    }
    
    public Personal(String personId, String fullName, Date birthday, String studentAddress, String email, String phoneNumber) {
        data = new PrivateData(personId, fullName, birthday, studentAddress, email, phoneNumber);
    }

    public PrivateData getData() {
        return data;
    }

    
    public void setPersonId(String personId) {
        data.setPersonId(personId);
    }

   
    public void setFullName(String fullName) {
        data.setFullName(fullName);
    }

    
    public void setBirthday(Date birthday) {
        data.setBirthday(birthday);
    }

 

    public void setStudentAddress(String studentAddress) {
        data.setStudentAddress(studentAddress);
    }

   
    public void setEmail(String email) {
        data.setEmail(email);
    }

    

    public void setPhoneNumber(String phoneNumber) {
        data.setPhoneNumber(phoneNumber);
    }
    
    
    
}
