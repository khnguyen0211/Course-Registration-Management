/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.observer;

import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public class SubjectObserver {
    private ArrayList<Observer> observerList = new  ArrayList<Observer>();
    
    public void attach(Observer o) {observerList.add(o);}
    public void detach(Observer o) {observerList.remove(o);}
    public void notifyObservers(SubjectObserver subject, Object arg) {
        for(Observer o : observerList) {
            o.SendNotify(subject, arg);
        }
    }
}
