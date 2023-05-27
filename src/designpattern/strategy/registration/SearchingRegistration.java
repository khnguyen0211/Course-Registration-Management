/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.registration;

import designpattern.models.Registration;
import java.util.ArrayList;



/**
 *
 * @author pnkn0
 */
public class SearchingRegistration {
    private ArrayList<Registration> regisList;
    private ISearching iSearch;

    public SearchingRegistration() {
    }

    public void setRegistrationList(ArrayList<Registration> regisList) {
        this.regisList = regisList;
    }

    public void setiSearch(ISearching iSearch) {
        this.iSearch = iSearch;
    }
    
    public ArrayList<Registration> search(String form, String to) {
        return iSearch.search(regisList, form, to);
    }

}
