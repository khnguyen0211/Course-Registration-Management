/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.daos;

import designpattern.models.Subject;
import designpattern.singleton.strategy.template.ManipulationSubject;
import designpattern.singleton.strategy.template.LoadSubjectList;
import designpattern.singleton.strategy.template.StrategyDAO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public class SubjectDAO {

    private String sql = "";
    private ConnectDatabase cd;
    private Connection conn;
    private PreparedStatement sttm;
    private ResultSet rs;

    private StrategyDAO strategyDAO = StrategyDAO.getInstance();

    public ArrayList<Subject> loadDataFromDB() throws SQLException {
        String sql = "select * from subjects";
        strategyDAO.setSql(sql);
        strategyDAO.setLoadDataStrategy(new LoadSubjectList());
        return strategyDAO.loadData();

    }

   
    public boolean addSubject(Subject subject) throws SQLException {
        sql = "insert Subjects(subjectId, subjectName, subjectType, credit) values(?, ?, ?, ?)";
        return implementationManipulation(subject, sql);
    }

    public boolean deleteSubject(Subject subject) throws SQLException {
        sql = "delete from subjects where subjectId = ?";
        return implementationManipulation(subject, sql);
    }

    public boolean updateSubject(Subject subject) throws SQLException {
        sql = "update subjects set subjectName = ?, subjectType = ?, credit = ? where subjectId = ?";
        return implementationManipulation(subject, sql);
    }

    public boolean implementationManipulation(Subject subject, String sql) {
        strategyDAO.setSql(sql);
        strategyDAO.setData(subject);
        strategyDAO.setManipulationData(new ManipulationSubject());
        return strategyDAO.manipulationData();
    }

    public boolean deleteSubjectById(String id) throws SQLException {
        sql = "delete subjects where subjectId = ?";
        cd = new ConnectDatabase();
        conn = cd.getConnection();
        sttm = conn.prepareStatement(sql);
        sttm.setString(1, id);

        if (sttm.executeUpdate() > 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        SubjectDAO a = new SubjectDAO();
        
    }
}
