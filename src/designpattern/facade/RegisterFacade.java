/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.facade;

import designpattern.controllers.RegistrationController;
import designpattern.controllers.StudentController;
import designpattern.controllers.SubjectController;
import designpattern.models.Registration;
import designpattern.models.Student;
import designpattern.models.Subject;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pnkn0
 */
public class RegisterFacade {

    private String studentId;
    private String subjectId;
    private CheckExistStudent checkStudent;
    private CheckExistSubject checkSubject;
    private CheckRegisteredSubject checkRegisSubject;
    private GetRegisterTime getRegisterTime;
    private SaveRegister saveRegis;
    private StudentController stuCon;
    private SubjectController subCon;
    private RegistrationController regisCon;

    public RegisterFacade(String studentId, String subjectId) throws SQLException {
        this.studentId = studentId;
        this.subjectId = subjectId;
        checkStudent = new CheckExistStudent();
        checkSubject = new CheckExistSubject();
        checkRegisSubject = new CheckRegisteredSubject();
        getRegisterTime = new GetRegisterTime();
        saveRegis = new SaveRegister();
        stuCon = new StudentController();
        subCon = new SubjectController();
        regisCon = new RegistrationController();
    }

    public boolean createRegister() throws SQLException {
        if (checkStudent.checkExist(studentId)) {
            if (checkSubject.checkExist(subjectId)) {
                if (checkRegisSubject.checkRegistered(studentId, subjectId)) {
                    Student student = stuCon.findStudentById(studentId);
                    Subject subject = subCon.findSubjectById(subjectId);
                    String registerTime = getRegisterTime.getTime();
                    Registration regis = new Registration(student, subject, registerTime, false);
                    saveRegis.save(regis);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Sinh viên đã đăng kí môn học này");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy môn học này");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy sinh viên này");
            return false;
        }
    }

}
