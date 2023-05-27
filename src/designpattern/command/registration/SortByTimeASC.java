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
public class SortByTimeASC implements ISortingCommand {

    private RegistrationTable regisTable;

    public SortByTimeASC(RegistrationTable regisTable) {
        this.regisTable = regisTable;
    }

    @Override
    public void execute() {
        regisTable.SortByTimeASC_action();
    }

    @Override
    public void undo() {
        regisTable.SortByTimeDESC_action();
    }

}
