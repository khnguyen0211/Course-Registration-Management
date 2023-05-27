/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.manipulationData;

import designpattern.models.Registration;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class RegistrationManipulationDataTemplate extends ManipulationDataTemplate<Registration> {

    @Override
    protected Registration createInstance() {
        return new Registration();
    }

    @Override
    protected void setFields(Registration regis, PreparedStatement sttm, String request) throws SQLException {
        
        
        if (request.compareTo("insert") == 0) {
            sttm.setString(1, regis.getStudent().getStudentId());
            sttm.setString(2, regis.getSubject().getSubjectId());
            sttm.setString(3, regis.getRegistrationDate());
            sttm.setBoolean(4, regis.isIsUpdate());
        } else if (request.compareTo("update") == 0) {

        } else if (request.compareTo("delete") == 0) {
            sttm.setString(1, regis.getStudent().getStudentId());
            sttm.setString(2, regis.getSubject().getSubjectId());
        }
    }

}
