/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.student;

import designpattern.command.ISortingCommand;

/**
 *
 * @author pnkn0
 */
public class SortByStudentIdASC implements ISortingCommand {

    private StudentTable studentList;

    public SortByStudentIdASC(StudentTable studentList) {
        this.studentList = studentList;
    }

    @Override
    public void execute() {
        studentList.SortStudentByIdASC_Action();
    }

    @Override
    public void undo() {
        studentList.SortStudentByIdDESC_Action();
    }

}
