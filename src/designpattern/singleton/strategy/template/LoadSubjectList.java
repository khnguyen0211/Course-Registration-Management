/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import designpattern.models.Subject;
import designpattern.template.loadData.LoadDataTemplate;
import designpattern.template.loadData.SubjectLoadDataTemplate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class LoadSubjectList implements ILoadData<Subject> {

    @Override
    public ArrayList<Subject> loadData(String sql) {
        LoadDataTemplate<Subject> loadSubjectData = new SubjectLoadDataTemplate();
        ArrayList<Subject> list = null;
        try {
            list = loadSubjectData.loadData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManipulationSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
