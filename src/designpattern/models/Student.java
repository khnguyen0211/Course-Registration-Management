/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class Student extends Personal {

    private String studentId;
    private String password;
    private String studentClass;
    private String major;
    private String academicYear;
    private ArrayList<Subject> subjectList = new ArrayList<>();
    
    public Student(){
        super();
    }

    public Student(String fullName, String studentId, String password, String email) {
        super(fullName, email);
        this.studentId = studentId;
        this.password = password;
    }
    
    public Student(String personId, String fullName, Date birthday, String studentAddress, String email, String phoneNumber, String studentId, String password, String studentClass, String major, String academicYear) {
        super(personId, fullName, birthday, studentAddress, email, phoneNumber);
        this.studentId = studentId;
        this.password = password;
        this.studentClass = studentClass;
        this.major = major;
        this.academicYear = academicYear;
    }

   
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    
    
}
