/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.subject;

import designpattern.command.ISortingCommand;

/**
 *
 * @author pnkn0
 */
public class SubjectSortingCommander {

    private ISortingCommand sortSubjectByCreditASC;
    private ISortingCommand sortSubjectByCreditDESC;
    private ISortingCommand sortSubjectByNameASC;
    private ISortingCommand sortSubjectByNameDESC;


    public SubjectSortingCommander() {
    }

    public ISortingCommand getSortSubjectByCreditASC() {
        return sortSubjectByCreditASC;
    }

    public void setSortSubjectByCreditASC(ISortingCommand sortSubjectByCreditASC) {
        this.sortSubjectByCreditASC = sortSubjectByCreditASC;
    }

    public ISortingCommand getSortSubjectByCreditDESC() {
        return sortSubjectByCreditDESC;
    }

    public void setSortSubjectByCreditDESC(ISortingCommand sortSubjectByCreditDESC) {
        this.sortSubjectByCreditDESC = sortSubjectByCreditDESC;
    }

    public ISortingCommand getSortSubjectByNameASC() {
        return sortSubjectByNameASC;
    }

    public void setSortSubjectByNameASC(ISortingCommand sortSubjectByNameASC) {
        this.sortSubjectByNameASC = sortSubjectByNameASC;
    }

    public ISortingCommand getSortSubjectByNameDESC() {
        return sortSubjectByNameDESC;
    }

    public void setSortSubjectByNameDESC(ISortingCommand sortSubjectByNameDESC) {
        this.sortSubjectByNameDESC = sortSubjectByNameDESC;
    }
    
    public void SortSubjectByNameASC_click() {
        sortSubjectByNameASC.execute();
    }

    public void SortSubjectByNameASC_unClick() {
        sortSubjectByNameASC.undo();
    }

    public void SortSubjectByNameDESC_click() {
        sortSubjectByNameDESC.execute();
    }

    public void SortSubjectByNameDESC_unClick() {
        sortSubjectByNameDESC.undo();
    }

    public void SortSubjectByCreditASC_click() {
        sortSubjectByCreditASC.execute();
    }

    public void SortSubjectByCreditASC_unClick() {
        sortSubjectByCreditASC.undo();
    }

    public void SortSubjectByCreditDESC_click() {
        sortSubjectByCreditDESC.execute();
    }

    public void SortSubjectByCreditDESC_unClick() {
        sortSubjectByCreditDESC.undo();
    }

}
