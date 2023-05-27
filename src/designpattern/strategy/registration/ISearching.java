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
interface ISearching {

    public ArrayList<Registration> search(ArrayList<Registration> regisList, String from, String to);
}
