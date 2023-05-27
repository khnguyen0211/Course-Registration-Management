/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.facade;

import designpattern.controllers.SubjectController;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class CheckExistSubject {

    boolean checkExist(String subjectId) throws SQLException {
        return new SubjectController().findSubjectById(subjectId) != null;
    }
    
}
