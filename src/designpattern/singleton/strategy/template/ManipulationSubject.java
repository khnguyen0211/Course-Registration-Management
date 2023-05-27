/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Subject;
import designpattern.template.manipulationData.ManipulationDataTemplate;
import designpattern.template.manipulationData.SubjectManipulationDataTemplate;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class ManipulationSubject implements IManipulationData<Subject>{

    @Override
    public boolean ManipulationData(Subject data, String sql) {
        ManipulationDataTemplate manipulationData = new SubjectManipulationDataTemplate();
        try {
            return manipulationData.manipulationData(data, sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManipulationSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
