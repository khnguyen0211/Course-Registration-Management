/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.student;

import designpattern.models.Student;
import java.util.ArrayList;



/**
 *
 * @author pnkn0
 */
public class SearchingStudent {
    private ArrayList<Student> studentList;
    private ISearching iSearch;

    public SearchingStudent() {
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setiSearch(ISearching iSearch) {
        this.iSearch = iSearch;
    }
    
    public ArrayList<Student> search(String s) {
        return iSearch.search(studentList, s);
    }

}
