/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.manipulationData;

import designpattern.models.Student;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class StudentManipulationDataTemplate extends ManipulationDataTemplate<Student> {

    @Override
    protected Student createInstance() {
        return new Student();
    }

    @Override
    protected void setFields(Student student, PreparedStatement sttm, String request) throws SQLException {
        java.util.Date utilStartDate = student.getData().getBirthday();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        if (request.compareTo("insert") == 0) {
            sttm.setString(1, student.getData().getPersonId());
            sttm.setString(2, student.getData().getFullName());
            sttm.setDate(3, sqlStartDate);
            sttm.setString(4, student.getData().getStudentAddress());
            sttm.setString(5, student.getData().getEmail());
            sttm.setString(6, student.getData().getPhoneNumber());
            sttm.setString(7, student.getStudentId());
            sttm.setString(8, student.getPassword());
            sttm.setString(9, student.getStudentClass());
            sttm.setString(10, student.getMajor());
            sttm.setString(11, student.getAcademicYear());
        } else if (request.compareTo("update") == 0) {
            sttm.setString(1, student.getData().getFullName());
            sttm.setDate(2, sqlStartDate);
            sttm.setString(3, student.getData().getStudentAddress());
            sttm.setString(4, student.getData().getEmail());
            sttm.setString(5, student.getData().getPhoneNumber());
            sttm.setString(6, student.getStudentId());
            sttm.setString(7, student.getStudentClass());
            sttm.setString(8, student.getMajor());
            sttm.setString(9, student.getAcademicYear());
            sttm.setString(10, student.getData().getPersonId());
        } else if (request.compareTo("delete") == 0) {
            sttm.setString(1, student.getStudentId());
        }
    }

}
