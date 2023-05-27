/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.controllers;

import designpattern.models.Course;
import designpattern.models.Student;
import designpattern.models.Subject;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pnkn0
 */
public class CourseController {

    private SubjectController subjectCon;
    private RegistrationController regisCon;

    public CourseController() throws SQLException {
        subjectCon = new SubjectController();
        regisCon = new RegistrationController();
    }

    public ArrayList<Course> getCourseList() throws SQLException {
        ArrayList<Subject> subjectList = subjectCon.getSubjectList();
        ArrayList<Course> courseList = new ArrayList<>();
        for (Subject sub : subjectList) {
            courseList.add(regisCon.getCourse(sub.getSubjectId()));
        }
        return courseList;
    }

    public void loadDataIntoTable(ArrayList<Course> courseList, JTable subjectTable) {
        DefaultTableModel model = new DefaultTableModel();
        subjectTable.setModel(model);

        model.addColumn("Lớp");
        model.addColumn("Mã lớp");
        model.addColumn("Nhóm");
        model.addColumn("Mã sinh viên");
        model.addColumn("Tên sinh viên");
        model.addColumn("Sĩ số");

        for (Course course : courseList) {
            Object[] rowData = new Object[6];
            int siso = course.getStudentList().size();
            int i = 1;
            rowData[0] = course.getSubjectName();
            rowData[1] = getClassID(course.getSubjectName());
            for (Student student : course.getStudentList()) {
                if(i <= siso / 2) {
                    rowData[2] = "Nhóm " + 1;
                    i++;
                } else {
                    rowData[2] = "Nhóm " + 2;
                    i++;
                } 
                rowData[3] = student.getStudentId();
                rowData[4] = student.getData().getFullName();
//                rowData[3] = course.getSubjectName();
//                rowData[4] = course.getSubjectName();
                rowData[5] = siso + "/20";
                model.addRow(rowData);
            }
                rowData[0] = "----------------------------------------";
                rowData[1] = "----------------------------------------";
                rowData[2] = "----------------------------------------";
                rowData[3] = "----------------------------------------";
                rowData[4] = "----------------------------------------";
                rowData[5] = "----------------------------------------";
            model.addRow(rowData);
            
        }
        
    }

    public String getClassID(String s) {
        String classId = "";
        String[] list = s.split(" ");
        for(String ss : list) {
            classId += ss.charAt(0);
        }
        return classId.toUpperCase();
    }

}
