/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.manipulationData;

import designpattern.models.Subject;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class SubjectManipulationDataTemplate extends ManipulationDataTemplate<Subject>{

    @Override
    protected Subject createInstance() {
        return new Subject();
    }

    @Override
    protected void setFields(Subject subject, PreparedStatement sttm, String request) throws SQLException {
        if(request.compareTo("insert") == 0) {
            sttm.setString(1, subject.getSubjectId());
            sttm.setString(2, subject.getSubjectName());
            sttm.setString(3, subject.getSubjectType());
            sttm.setInt(4, subject.getCredit());
        } else if(request.compareTo("update") == 0) {
            sttm.setString(1, subject.getSubjectName());
            sttm.setString(2, subject.getSubjectType());
            sttm.setInt(3, subject.getCredit());
            sttm.setString(4, subject.getSubjectId());
        } else if(request.compareTo("delete") == 0) {
            sttm.setString(1, subject.getSubjectId());
        }  
    }
   
}


