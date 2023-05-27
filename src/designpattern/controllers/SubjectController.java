/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.controllers;

import designpattern.command.subject.SubjectTable;
import designpattern.command.subject.SortByCreditASC;
import designpattern.command.subject.SortByCreditDESC;
import designpattern.command.subject.SortBySubjectNameASC;
import designpattern.command.subject.SortBySubjectNameDESC;
import designpattern.command.subject.SubjectSortingCommander;
import designpattern.daos.SubjectDAO;
import designpattern.models.Subject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pnkn0
 */
public class SubjectController {

    private ArrayList<Subject> subjectList;
    private SubjectDAO subDAO;
    private SubjectSortingCommander subjectCommander = new SubjectSortingCommander();

    public SubjectDAO getSubDAO() {
        return subDAO;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public SubjectController() throws SQLException {
        subDAO = new SubjectDAO();
        subjectList = subDAO.loadDataFromDB();
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void insertSubject(Subject subject) throws SQLException {
        if (findSubjectById(subject.getSubjectId()) == null) {
            if (subDAO.addSubject(subject)) {
                JOptionPane.showMessageDialog(null, "Đã thêm môn học " + subject.getSubjectName() + " vào trong hệ thống");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm môn học thất bại");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Đã tồn tại môn học " + subject.getSubjectName());
        }

    }

    public boolean deleteSubject(Subject sub) throws SQLException {
        RegistrationController regisCon = new RegistrationController();
        if(regisCon.findRegisBySubject(sub.getSubjectId())) {
            return false;
        }
        return subDAO.deleteSubject(sub);
    }

    public Subject findSubjectById(String id)  {
        try {
            subjectList = subDAO.loadDataFromDB();
            for (Subject sub : subjectList) {
                if (sub.getSubjectId().compareTo(id) == 0) {
                    return sub;
                }
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(SubjectController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public SubjectSortingCommander getSubjectCommander() {
        SubjectTable subList = new SubjectTable(subjectList);

        SortByCreditASC sort1 = new SortByCreditASC(subList);
        SortByCreditDESC sort2 = new SortByCreditDESC(subList);
        SortBySubjectNameASC sort3 = new SortBySubjectNameASC(subList);
        SortBySubjectNameDESC sort4 = new SortBySubjectNameDESC(subList);
        
        subjectCommander.setSortSubjectByCreditASC(sort1);
        subjectCommander.setSortSubjectByCreditDESC(sort2);
        subjectCommander.setSortSubjectByNameASC(sort3);
        subjectCommander.setSortSubjectByNameDESC(sort4);
        return subjectCommander;
    }

    public void loadDataIntoTable(ArrayList<Subject> subjectList, JTable subjectTable) {
        DefaultTableModel model = new DefaultTableModel();
        subjectTable.setModel(model);

        model.addColumn("STT");
        model.addColumn("MÃ MH");
        model.addColumn("TÊN MH");
        model.addColumn("LOẠI MH");
        model.addColumn("SỐ TC");

        int stt = 1;
        for (Subject sub : subjectList) {
            Object[] rowData = new Object[5];
            rowData[0] = stt;
            rowData[1] = sub.getSubjectId();
            rowData[2] = sub.getSubjectName();
            rowData[3] = sub.getSubjectType();
            rowData[4] = sub.getCredit();
            model.addRow(rowData);
            stt++;
        }
    }
}
