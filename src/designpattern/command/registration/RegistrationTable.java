/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.command.registration;

import designpattern.models.Registration;
import designpattern.sorts.SortRegisteringByRegisterTimeASC;
import designpattern.sorts.SortRegisteringByRegisterTimeDESC;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pnkn0
 */
public class RegistrationTable {

    private ArrayList<Registration> regisList;

    public RegistrationTable() {
    }

    public RegistrationTable(ArrayList<Registration> regisList) {
        this.regisList = regisList;
    }

    public ArrayList<Registration> getRegisList() {
        return regisList;
    }

    public void setRegisList(ArrayList<Registration> regisList) {
        this.regisList = regisList;
    }

    public void SortByTimeASC_action() {
        Collections.sort(regisList, new SortRegisteringByRegisterTimeASC());
    }

    public void SortByTimeDESC_action() {
        Collections.sort(regisList, new SortRegisteringByRegisterTimeDESC());
    }

}
