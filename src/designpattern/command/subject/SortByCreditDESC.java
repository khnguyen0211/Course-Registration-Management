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
public class SortByCreditDESC implements ISortingCommand {

    private SubjectTable subjectList;

    public SortByCreditDESC(SubjectTable subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public void execute() {
        subjectList.SortSubjectByCreditDESC_Action();
    }

    @Override
    public void undo() {
        subjectList.SortSubjectByCreditASC_Action();
    }

}
