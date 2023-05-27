/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Student;
import designpattern.template.manipulationData.ManipulationDataTemplate;
import designpattern.template.manipulationData.StudentManipulationDataTemplate;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class ManipulationStudent implements IManipulationData<Student>{

    @Override
    public boolean ManipulationData(Student data, String sql) {
        ManipulationDataTemplate addStudentTemplate = new StudentManipulationDataTemplate();
        try {
            return addStudentTemplate.manipulationData(data, sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManipulationStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
       
}
