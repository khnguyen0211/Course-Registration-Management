/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.loadData;

import designpattern.models.Student;
import designpattern.views.admin.AddStudent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class StudentLoadDataTemplate extends LoadDataTemplate<Student> {

    @Override
    public Student createInstance() {
        return new Student();
    }

    @Override
    protected void setFields(Student instance, ResultSet rs) throws SQLException {
        instance.setPersonId(rs.getString("personId"));
        instance.setFullName(rs.getString("fullName"));
        instance.setBirthday(rs.getDate("birthday"));
        instance.setStudentAddress(rs.getString("studentAddress"));
        instance.setEmail(rs.getString("email"));
        instance.setPhoneNumber(rs.getString("phoneNumber"));
        instance.setStudentId(rs.getString("studentId"));
        instance.setPassword(rs.getString("password"));
        instance.setStudentClass(rs.getString("studentClass"));
        instance.setMajor(rs.getString("major"));
        instance.setAcademicYear(rs.getString("academicYear"));
    }

    public Date convertToDate(String s) {
        String birthday = s;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
        Date date = null;
        try {
            date = dateFormat.parse(birthday);
        } catch (ParseException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
    
    public static void main(String[] args) {
        StudentLoadDataTemplate x = new StudentLoadDataTemplate();
        System.out.println(x.convertToDate("2002-02-11"));
    }

}
