/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.daos;

import designpattern.controllers.StudentController;
import designpattern.controllers.SubjectController;
import designpattern.models.Registration;
import designpattern.models.Student;
import designpattern.models.Subject;
import designpattern.singleton.strategy.template.ManipulationRegistration;
import designpattern.singleton.strategy.template.LoadRegistrationList;
import designpattern.singleton.strategy.template.StrategyDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public class RegistrationDAO {

    String sql = "";
    ConnectDatabase cd;
    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;
    private StrategyDAO strategyDAO = StrategyDAO.getInstance();

    public ArrayList<Registration> loadDataFromDB() throws SQLException {
        String sql = "select * from registration";
        strategyDAO.setSql(sql);
        strategyDAO.setLoadDataStrategy(new LoadRegistrationList());
        return strategyDAO.loadData();
    }

    public boolean addRegistration(Registration regis) {
        sql = "insert registration(student_id, subject_id, registrationDate, isUpdate) values(?, ?, ?, ?)";
        return implementationManipulation(regis, sql);
    }
    public boolean deleteRegistration(Registration regis) {
        sql = "delete from registration where student_id = ? and subject_id = ?";
        return implementationManipulation(regis, sql);
    }
    public boolean updateRegistration(Registration regis) {
        deleteRegistration(regis);
        return addRegistration(regis);
    }
    public boolean implementationManipulation(Registration regis, String sql) {
        strategyDAO.setSql(sql);
        strategyDAO.setData(regis);
        strategyDAO.setManipulationData(new ManipulationRegistration());
        return strategyDAO.manipulationData();
    }
    
    public static void main(String[] args) throws SQLException {
        RegistrationDAO s = new RegistrationDAO();
        
        SubjectController a = new SubjectController();
        Subject sta = a.findSubjectById("504644");
        StudentController b = new StudentController();
        Student stb = b.findStudentById("52000002");
        
        s.updateRegistration(new Registration(stb, sta, "", false));
    }

}
