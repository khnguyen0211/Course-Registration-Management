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
public interface IStudentBuilder {
    IStudentBuilder addPersonId(String personId);
    IStudentBuilder addFullName(String fullName);
    IStudentBuilder addBirthday(Date birthday);
    IStudentBuilder addStudentAddress(String studentAddress);
    IStudentBuilder addEmail(String email);
    IStudentBuilder addPhoneNumber(String phoneNumber);
    IStudentBuilder addStudentId(String studentId);
    IStudentBuilder addPassword(String password);
    IStudentBuilder addStudentClass(String studentClass);
    IStudentBuilder addMajor(String major);
    IStudentBuilder addAcademicYear(String academicYear);
    Student buildAStudent();
}
