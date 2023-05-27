/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

/**
 *
 * @author pnkn0
 */
public interface IManipulationData<T> {
    public boolean ManipulationData(T data, String sql); 
}
