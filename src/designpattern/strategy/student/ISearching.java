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
interface ISearching {

    public ArrayList<Student> search(ArrayList<Student> subjectList, String s);
}
