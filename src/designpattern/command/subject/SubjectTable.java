/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.subject;

import designpattern.models.Subject;
import designpattern.sorts.SortSubjectByNameASC;
import designpattern.sorts.SortSubjectByNameDESC;
import designpattern.sorts.SortSubjectByCreditDESC;
import designpattern.sorts.SortSubjectByCreditASC;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pnkn0
 */
public class SubjectTable {
    private ArrayList<Subject> subjectList;
    

    
    public SubjectTable(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    
    

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    
    public void SortSubjectByNameASC_Action() {
        Collections.sort(subjectList, new SortSubjectByNameASC());
    }
    
    public void SortSubjectByNameDESC_Action() {
        Collections.sort(subjectList, new SortSubjectByNameDESC());
    }
    
    public void SortSubjectByCreditASC_Action() {
        Collections.sort(subjectList, new SortSubjectByCreditASC());
    }
    
    public void SortSubjectByCreditDESC_Action() {
        Collections.sort(subjectList, new SortSubjectByCreditDESC());
    }
    
   
}
