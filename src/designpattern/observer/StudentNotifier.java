/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.observer;

import designpattern.controllers.RegistrationController;
import designpattern.models.Course;
import designpattern.models.Registration;
import designpattern.models.Student;
import designpattern.models.Subject;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class StudentNotifier extends Observer {

    public StudentNotifier(SubjectObserver so) {
        this.subject = so;
        this.subject.attach(this);
    }

    @Override
    public void SendNotify(SubjectObserver subject, Object arg) {
        if (subject instanceof Subject) {
            String subjectId = ((Subject) subject).getSubjectId();
            try {
                RegistrationController regisCon = new RegistrationController();
                ArrayList<Registration> regisList = regisCon.getRegisList();
                Course course = regisCon.getCourse(subjectId);
                ArrayList<Student> studenList = course.getStudentList();
                Date currentDate = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                String formattedDate = formatter.format(currentDate);
                for (Student a : studenList) {
                    Registration regis = new Registration(a, (Subject) subject, formattedDate, true);
                    regisCon.updateRegis(regis);
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentNotifier.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
