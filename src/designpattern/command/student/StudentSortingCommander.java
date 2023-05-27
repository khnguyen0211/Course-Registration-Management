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
public class StudentSortingCommander {

   
    private ISortingCommand sortStudentByIdASC;
    private ISortingCommand sortStudentByIdDESC;
    private ISortingCommand sortStudentByNameASC;
    private ISortingCommand sortStudentByNameDESC;

    public StudentSortingCommander() {
    }

    public ISortingCommand getSortStudentByIdASC() {
        return sortStudentByIdASC;
    }

    public void setSortStudentByIdASC(ISortingCommand sortStudentByIdASC) {
        this.sortStudentByIdASC = sortStudentByIdASC;
    }

    public ISortingCommand getSortStudentByNameASC() {
        return sortStudentByNameASC;
    }

    public void setSortStudentByNameASC(ISortingCommand sortStudentByNameASC) {
        this.sortStudentByNameASC = sortStudentByNameASC;
    }

    public ISortingCommand getSortStudentByNameDESC() {
        return sortStudentByNameDESC;
    }

    public void setSortStudentByNameDESC(ISortingCommand sortStudentByNameDESC) {
        this.sortStudentByNameDESC = sortStudentByNameDESC;
    }

    public void setSortStudentByIdDESC(ISortingCommand sortStudentByIdDESC) {
        this.sortStudentByIdDESC = sortStudentByIdDESC;
    }
    
    public void SortStudentByIdASC_click() {
        sortStudentByIdASC.execute();
    }
    
    public void SortStudentByIdDESC_click() {
        sortStudentByIdDESC.execute();
    }
    
    

    public void SortStudentByNameASC_click() {
        sortStudentByNameASC.execute();
    }

    public void SortStudentByNameDESC_click() {
        sortStudentByNameDESC.execute();
    }

    public void SortStudentByIdASC_unClick() {
        sortStudentByIdASC.undo();
    }
    
    public void SortStudentByIdDESC_unClick() {
        sortStudentByIdDESC.undo();
    }

    public void SortStudentByNameASC_unClick() {
        sortStudentByNameASC.undo();
    }

    public void SortStudentByNameDESC_unClick() {
        sortStudentByNameDESC.undo();
    }

}
