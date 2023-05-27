/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Registration;
import designpattern.template.manipulationData.ManipulationDataTemplate;
import designpattern.template.manipulationData.RegistrationManipulationDataTemplate;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class ManipulationRegistration implements IManipulationData<Registration>{

    @Override
    public boolean ManipulationData(Registration data, String sql) {
        ManipulationDataTemplate addRegisTemplate = new RegistrationManipulationDataTemplate();
        try {
            return addRegisTemplate.manipulationData(data, sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManipulationRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
