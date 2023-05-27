/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.models;

import designpattern.observer.SubjectObserver;

/**
 *
 * @author pnkn0
 */
public class Subject extends SubjectObserver{
    private String subjectId;
    private String subjectName;
    private String subjectType;
    private int credit;

    public Subject(String subjectId, String subjectName, String subjectType, int credit) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.credit = credit;
    }

    public Subject() {
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        changed();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        changed();
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        changed();
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
        changed();
    }

    @Override
    public String toString() {
        return this.getSubjectName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void changed() {
        notifyObservers(this, null);
    }
}
