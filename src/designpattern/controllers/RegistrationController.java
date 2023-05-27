/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.controllers;

import designpattern.command.registration.RegisSortingCommander;
import designpattern.command.registration.RegistrationTable;
import designpattern.command.registration.SortByTimeASC;
import designpattern.command.registration.SortByTimeDESC;
import designpattern.daos.RegistrationDAO;
import designpattern.models.Course;
import designpattern.models.Registration;
import designpattern.models.Student;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pnkn0
 */
public class RegistrationController {

    private ArrayList<Registration> regisList;
    private RegistrationDAO regisDAO;
    private RegisSortingCommander regisCommander = new RegisSortingCommander();

    public RegistrationController() throws SQLException {
        regisDAO = new RegistrationDAO();
        regisList = regisDAO.loadDataFromDB();
    }

    public void insertRegis(Registration regis) {
        regisDAO.addRegistration(regis);
    }

    public ArrayList<Registration> getRegisList() {
        return regisList;
    }

    public void setRegisList(ArrayList<Registration> regisList) {
        this.regisList = regisList;
    }

    public RegistrationDAO getRegisDAO() {
        return regisDAO;
    }

    public void setRegisDAO(RegistrationDAO regisDAO) {
        this.regisDAO = regisDAO;
    }

    public Course getCourse(String subjectID) throws SQLException {
        String subjectName = "";
        ArrayList<Student> studentList = new ArrayList<>();
        Course course = new Course();
        if (new SubjectController().findSubjectById(subjectID) != null) {
            for (Registration regis : regisList) {
                if (regis.getSubject().getSubjectId().compareTo(subjectID) == 0) {
                    studentList.add(regis.getStudent());
                }
            }
            subjectName = new SubjectController().findSubjectById(subjectID).getSubjectName();
            course.setSubjectName(subjectName);
            course.setStudentList(studentList);
            return course;
        } else {
            return null;
        }
    }

    public boolean deleteRegis(Registration s) {
        return regisDAO.deleteRegistration(s);
    }
    
    public boolean updateRegis(Registration s) {
        return regisDAO.updateRegistration(s);
    }
    
    public boolean findRegisBySubject(String subjectId) {
        for(Registration regis : regisList) {
            if(regis.getSubject().getSubjectId().compareTo(subjectId) == 0) {
                return true;
            }
        }
        return false;
    }

    public void loadDataIntoTable(ArrayList<Registration> regisList, JTable regisTable) {
        DefaultTableModel model = new DefaultTableModel();
        regisTable.setModel(model);
        model.addColumn("STT");
        model.addColumn("TÊN SV");
        model.addColumn("MÃ SV");
        model.addColumn("LỚP");
        model.addColumn("MÃ MÔN");
        model.addColumn("TÊN MÔN");
        model.addColumn("THỜI GIAN ĐĂNG KÍ");

        int stt = 1;
        for (Registration regis : regisList) {
            Object[] rowData = new Object[7];
            rowData[0] = stt++;
            rowData[1] = regis.getStudent().getStudentId();
            rowData[2] = regis.getStudent().getData().getFullName();
            rowData[3] = regis.getStudent().getStudentClass();
            rowData[4] = regis.getSubject().getSubjectId();
            rowData[5] = regis.getSubject().getSubjectName();
            rowData[6] = regis.getRegistrationDate();
            model.addRow(rowData);
        }
    }
    
    public RegisSortingCommander getCommander() {
        RegistrationTable registTable = new RegistrationTable(this.regisList);
        
        SortByTimeASC sort1 = new SortByTimeASC(registTable);
        SortByTimeDESC sort2 = new SortByTimeDESC(registTable);
        
        regisCommander.setSortByTimeASC(sort1);
        regisCommander.setSortByTimeDESC(sort2);
        return regisCommander;
    }

}
