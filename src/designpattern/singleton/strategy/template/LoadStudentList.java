/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Student;
import designpattern.template.loadData.LoadDataTemplate;
import designpattern.template.loadData.StudentLoadDataTemplate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class LoadStudentList implements ILoadData<Student> {

    @Override
    public ArrayList<Student> loadData(String sql) {
        ArrayList<Student> list = null;
        LoadDataTemplate<Student> loadStudentData = new StudentLoadDataTemplate();
        try {
            list = loadStudentData.loadData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LoadStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
