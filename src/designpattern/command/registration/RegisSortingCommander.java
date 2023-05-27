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
public class RegisSortingCommander {

    private ISortingCommand sortByTimeASC;
    private ISortingCommand sortByTimeDESC;

    public RegisSortingCommander() {
    }

    public RegisSortingCommander(ISortingCommand sortByTimeASC, ISortingCommand sortByTimeDESC) {
        this.sortByTimeASC = sortByTimeASC;
        this.sortByTimeDESC = sortByTimeDESC;
    }

    public ISortingCommand getSortByTimeASC() {
        return sortByTimeASC;
    }

    public void setSortByTimeASC(ISortingCommand sortByTimeASC) {
        this.sortByTimeASC = sortByTimeASC;
    }

    public ISortingCommand getSortByTimeDESC() {
        return sortByTimeDESC;
    }

    public void setSortByTimeDESC(ISortingCommand sortByTimeDESC) {
        this.sortByTimeDESC = sortByTimeDESC;
    }

    public void sortByTimeASC_click() {
        sortByTimeASC.execute();
    }

    public void sortByTimeASC_unClick() {
        sortByTimeASC.undo();
    }

    public void sortByTimeDESC_click() {
        sortByTimeDESC.execute();
    }

    public void sortByTimeDESC_unClick() {
        sortByTimeDESC.undo();
    }

}
