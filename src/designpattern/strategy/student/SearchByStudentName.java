/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.student;

import designpattern.models.Student;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pnkn0
 */
public class SearchByStudentName implements ISearching{

    public ArrayList<Student> search(ArrayList<Student> studentList, String s) {
        ArrayList<Student> findedStudent = new ArrayList<>();
        s = s.toLowerCase();
        for (Student stu : studentList) {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(stu.getData().getFullName().toLowerCase());
            if (matcher.find()) {
                findedStudent.add(stu);
            }
        }
        return findedStudent;
    }
}
