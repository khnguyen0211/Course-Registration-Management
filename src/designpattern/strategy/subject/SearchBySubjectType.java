/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.subject;

import designpattern.models.Subject;
import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public class SearchBySubjectType implements ISearching {

    @Override
    public ArrayList<Subject> search(ArrayList<Subject> subjectList, String s) {
        ArrayList<Subject> findedSubject = new ArrayList<>();
        for (Subject sub : subjectList) {
            if (sub.getSubjectType().compareTo(s) == 0) {
                findedSubject.add(sub);
            }
        }
        return findedSubject;
    }

}
