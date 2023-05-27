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
public class SortBySubjectNameDESC implements ISortingCommand {

    private SubjectTable subjectList;

    public SortBySubjectNameDESC(SubjectTable subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public void execute() {
        subjectList.SortSubjectByNameDESC_Action();
    }

    @Override
    public void undo() {
        subjectList.SortSubjectByNameASC_Action();
    }
}
