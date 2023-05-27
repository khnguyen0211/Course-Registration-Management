/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.facade;

import designpattern.controllers.StudentController;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class CheckRegisteredSubject {

    boolean checkRegistered(String studentId, String subjectId) throws SQLException {
        return new StudentController().checkExistSubject(studentId, subjectId);
    }
    
}
