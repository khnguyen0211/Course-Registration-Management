/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.loadData;

import designpattern.controllers.StudentController;
import designpattern.controllers.SubjectController;
import designpattern.models.Registration;
import designpattern.models.Student;
import designpattern.models.Subject;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class RegistrationLoadDataTemplate extends LoadDataTemplate<Registration> {
    
    @Override
    protected Registration createInstance() {
        return new Registration();
    }
    
    @Override
    protected void setFields(Registration instance, ResultSet rs) throws SQLException {
        String studentId = rs.getString("student_id");
        Student stu = new StudentController().findStudentById(studentId);
        String subjectId = rs.getString("subject_id");
        Subject sub = new SubjectController().findSubjectById(subjectId);
        Boolean isUpdate = rs.getBoolean("isUpdate");
        instance.setStudent(stu);
        instance.setSubject(sub);
        instance.setIsUpdate(isUpdate);
        instance.setRegistrationDate(rs.getString("registrationDate"));
    }
    
}
