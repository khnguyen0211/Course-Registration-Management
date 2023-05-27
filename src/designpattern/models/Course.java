/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.models;

import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public class Course {

    private String subjectName;
    private ArrayList<Student> studentList;
    
    public Course() {
        studentList = new ArrayList<>();
    }
    public Course(String subjectName, ArrayList<Student> studentList) {
        this.subjectName = subjectName;
        this.studentList = studentList;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return subjectName + " - " + studentList.size();
    }
    
    
}
