/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.subject;

import designpattern.models.Subject;
import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
interface ISearching {
    public ArrayList<Subject> search(ArrayList<Subject> subjectList, String s);
}
