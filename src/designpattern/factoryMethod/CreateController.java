/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.factoryMethod;

import designpattern.controllers.RegistrationController;
import designpattern.controllers.StudentController;
import designpattern.controllers.SubjectController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class CreateController implements FactoryMethod {

    public CreateController() {
    }
    
    @Override
    public Object createController(String logic) {
        logic = logic.toLowerCase();
        if (logic.contains("student")) {
            try {
                return new StudentController();
            } catch (SQLException ex) {
                Logger.getLogger(CreateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (logic.contains("subject")) {
            try {
                return new SubjectController();
            } catch (SQLException ex) {
                Logger.getLogger(CreateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (logic.contains("registration")) {
            try {
                return new RegistrationController();
            } catch (SQLException ex) {
                Logger.getLogger(CreateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
