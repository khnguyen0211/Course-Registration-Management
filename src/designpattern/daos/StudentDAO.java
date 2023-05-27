/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.daos;

import designpattern.models.Student;
import designpattern.models.Subject;
import designpattern.singleton.strategy.template.ManipulationStudent;
import designpattern.singleton.strategy.template.ManipulationSubject;
import designpattern.singleton.strategy.template.LoadStudentList;
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
public class StudentDAO {

    String sql = "";
    ConnectDatabase cd;
    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    private StrategyDAO strategyDAO = StrategyDAO.getInstance();

    public ArrayList<Student> loadDataFromDB() throws SQLException {
        String sql = "select * from students";
        strategyDAO.setSql(sql);
        strategyDAO.setLoadDataStrategy(new LoadStudentList());
        
        return strategyDAO.loadData();

    }

    public boolean addStudent(Student student) throws SQLException {
        sql = "insert students(personId, fullName, birthday, studentAddress, email, phoneNumber, studentId, password ,studentClass, major, academicYear) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return implementationManipulation(student, sql);
    }
    
    public boolean delete(Student student) throws SQLException {
        sql = "delete from students where studentId = ?";
        return implementationManipulation(student, sql);
    }
    
    public boolean implementationManipulation(Student student, String sql) {
        strategyDAO.setSql(sql);
        strategyDAO.setData(student);
        strategyDAO.setManipulationData(new ManipulationStudent());
        return strategyDAO.manipulationData();
    }
   
}
