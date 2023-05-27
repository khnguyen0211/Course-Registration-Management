/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.observer;

/**
 *
 * @author pnkn0
 */
public abstract class Observer {
    protected SubjectObserver subject;
    public abstract void SendNotify(SubjectObserver subject, Object arg);
    
}
