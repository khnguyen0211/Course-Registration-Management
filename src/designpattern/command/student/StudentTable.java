/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.student;

import designpattern.models.Student;
import designpattern.sorts.SortStudentByNameASC;
import designpattern.sorts.SortStudentByNameDESC;
import designpattern.sorts.SortStudentByIdASC;
import designpattern.sorts.SortStudentByIdDESC;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pnkn0
 */
public class StudentTable {

    private ArrayList<Student> studentList;

    public StudentTable(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void SortStudentByNameASC_Action() {
        Collections.sort(studentList, new SortStudentByNameASC());
    }

    public void SortStudentByNameDESC_Action() {
        Collections.sort(studentList, new SortStudentByNameDESC());
    }

    public void SortStudentByIdASC_Action() {
        Collections.sort(studentList, new SortStudentByIdASC());
    }
    
    public void SortStudentByIdDESC_Action() {
        Collections.sort(studentList, new SortStudentByIdDESC());
    }


}
