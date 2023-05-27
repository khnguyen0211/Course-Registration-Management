/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.builder;

import designpattern.models.Student;
import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class StudentBuilder implements IStudentBuilder {

    private String personId;
    private String fullName;
    private Date birthday;
    private String studentAddress;
    private String email;
    private String phoneNumber;
    private String studentId;
    private String password;
    private String studentClass;
    private String major;
    private String academicYear;

    @Override
    public IStudentBuilder addPersonId(String personId) {
        this.personId = personId;
        return this;
    }

    @Override
    public IStudentBuilder addFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Override
    public IStudentBuilder addBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public IStudentBuilder addStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    @Override
    public IStudentBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public IStudentBuilder addPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public IStudentBuilder addStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }
    
    @Override
    public IStudentBuilder addPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public IStudentBuilder addStudentClass(String studentClass) {
        this.studentClass = studentClass;
        return this;
    }

    @Override
    public IStudentBuilder addMajor(String major) {
        this.major = major;
        return this;
    }

    @Override
    public IStudentBuilder addAcademicYear(String academicYear) {
        this.academicYear = academicYear;
        return this;
    }

    @Override
    public Student buildAStudent() {
        return new Student(personId, fullName, birthday, studentAddress, email, phoneNumber, studentId, password, studentClass, major, academicYear);
    }

    

    

}
