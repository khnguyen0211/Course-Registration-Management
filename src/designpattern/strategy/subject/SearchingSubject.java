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
public class SearchingSubject {
    private ArrayList<Subject> subjectList;
    private ISearching iSearch;

    public SearchingSubject() {
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void setiSearch(ISearching iSearch) {
        this.iSearch = iSearch;
    }
    
    public ArrayList<Subject> search(String s) {
        return iSearch.search(subjectList, s);
    }

}
