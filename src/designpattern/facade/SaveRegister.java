/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.facade;

import designpattern.controllers.RegistrationController;
import designpattern.models.Registration;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class SaveRegister {

    void save(Registration regis) throws SQLException {
        new RegistrationController().insertRegis(regis);
    }

}
