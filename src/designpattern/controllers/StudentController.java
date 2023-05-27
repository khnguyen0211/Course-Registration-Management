/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.controllers;

import designpattern.command.student.SortByStudentIdASC;
import designpattern.command.student.SortByStudentIdDESC;
import designpattern.command.student.SortByStudentNameASC;
import designpattern.command.student.SortByStudentNameDESC;
import designpattern.command.student.StudentSortingCommander;
import designpattern.command.student.StudentTable;
import designpattern.daos.StudentDAO;
import designpattern.models.Registration;
import designpattern.models.Student;
import designpattern.models.Subject;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pnkn0
 */
public class StudentController {

    private ArrayList<Student> studentList;
    private StudentDAO stuDAO;
    private StudentSortingCommander studentCommander = new StudentSortingCommander();

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public StudentController() throws SQLException {
        stuDAO = new StudentDAO();
        studentList = stuDAO.loadDataFromDB();
    }

    public boolean insertStudent(Student x) throws SQLException {
        return stuDAO.addStudent(x);
    }

    public boolean deleteStudent(Student x) throws SQLException {
        return stuDAO.delete(x);
    }

    public void loadDataIntoTable(ArrayList<Student> studentList, JTable studentTable) {
        DefaultTableModel model = new DefaultTableModel();
        studentTable.setModel(model);
        model.addColumn("STT");
        model.addColumn("MÃ SV");
        model.addColumn("TÊN SV");
        model.addColumn("NGÀY SINH");
        model.addColumn("ĐỊA CHỈ");
        model.addColumn("EMAIL");
        model.addColumn("SỐ ĐIỆN THOẠI");
        model.addColumn("LỚP");
        model.addColumn("CHUYÊN NGÀNH");
        model.addColumn("NIÊN KHÓA");

        int stt = 1;
        for (Student stu : studentList) {
            Object[] rowData = new Object[10];
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = formatter.format(stu.getData().getBirthday());
            rowData[0] = stt;
            rowData[1] = stu.getStudentId();
            rowData[2] = stu.getData().getFullName();
            rowData[3] = dateString;
            rowData[4] = stu.getData().getStudentAddress();
            rowData[5] = stu.getData().getEmail();
            rowData[6] = stu.getData().getPhoneNumber();
            rowData[7] = stu.getStudentClass();
            rowData[8] = stu.getMajor();
            rowData[9] = stu.getAcademicYear();
            model.addRow(rowData);
            stt++;
        }
    }

    public boolean checkLogin(String username, String password) {
        for (Student student : studentList) {
            if (student.getStudentId().compareTo(username) == 0) {
                if (student.getPassword().compareTo(password) == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public Student findStudentById(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().compareToIgnoreCase(studentId) == 0) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Subject> getSubjectList(String studentId) throws SQLException {
        ArrayList<Subject> list = new ArrayList<>();
        RegistrationController regisCon = new RegistrationController();
        for (Registration regis : regisCon.getRegisList()) {
            if (regis.getStudent().getStudentId().compareTo(studentId) == 0) {
                list.add(regis.getSubject());
            }
        }
        return list;
    }

    public boolean checkExistSubject(String stuId, String subId) throws SQLException {
        ArrayList<Subject> subjectList = getSubjectList(stuId);
        for (Subject sub : subjectList) {
            if (sub.getSubjectId().compareTo(subId) == 0) {
                return false;
            }
        }
        return true;
    }

    public StudentSortingCommander getStudentCommander() {
        StudentTable studentTable = new StudentTable(studentList);
        SortByStudentIdASC sort1 = new SortByStudentIdASC(studentTable);
        SortByStudentNameASC sort2 = new SortByStudentNameASC(studentTable);
        SortByStudentNameDESC sort3 = new SortByStudentNameDESC(studentTable);
        SortByStudentIdDESC sort4 = new SortByStudentIdDESC(studentTable);
        studentCommander.setSortStudentByIdASC(sort1);
        studentCommander.setSortStudentByNameASC(sort2);
        studentCommander.setSortStudentByNameDESC(sort3);
        studentCommander.setSortStudentByIdDESC(sort4);
        return studentCommander;
    }

}
