/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Registration;
import designpattern.template.loadData.LoadDataTemplate;
import designpattern.template.loadData.RegistrationLoadDataTemplate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class LoadRegistrationList implements ILoadData<Registration> {

    @Override
    public ArrayList<Registration> loadData(String sql) {
        LoadDataTemplate<Registration> loadRegisData = new RegistrationLoadDataTemplate();
        ArrayList<Registration> list = null;
        try {
            list = loadRegisData.loadData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManipulationSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
