/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.models;

/**
 *
 * @author pnkn0
 */
public class Registration {

    private Student student;
    private Subject subject;
    private String registrationDate;
    private boolean isUpdate;
    
    public Registration(Student student, Subject subject, String registrationDate, boolean isUpdate) {
        this.student = student;
        this.subject = subject;
        this.registrationDate = registrationDate;
        this.isUpdate = isUpdate;
    }
    
    

    public Registration(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }
    
    public Registration() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

   

}
