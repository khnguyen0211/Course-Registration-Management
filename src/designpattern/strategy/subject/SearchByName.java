/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.subject;

import designpattern.models.Subject;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pnkn0
 */
public class SearchByName implements ISearching {

    @Override
    public ArrayList<Subject> search(ArrayList<Subject> subjectList, String s) {
        ArrayList<Subject> findedSubject = new ArrayList<>();
        s = s.toLowerCase();
        for (Subject sub : subjectList) {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(sub.getSubjectName().toLowerCase());
            if (matcher.find()) {
                findedSubject.add(sub);
            }
        }
        return findedSubject;
    }

}
