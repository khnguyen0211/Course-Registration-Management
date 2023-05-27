/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.registration;

import designpattern.command.ISortingCommand;

/**
 *
 * @author pnkn0
 */
public class SortByTimeDESC implements ISortingCommand{
    private RegistrationTable regisTable;

    public SortByTimeDESC(RegistrationTable regisTable) {
        this.regisTable = regisTable;
    }
    
    @Override
    public void execute() {
        regisTable.SortByTimeDESC_action();
    }

    @Override
    public void undo() {
        regisTable.SortByTimeASC_action();
    }
    
}
