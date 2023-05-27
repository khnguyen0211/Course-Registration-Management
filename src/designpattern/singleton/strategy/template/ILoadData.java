/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.singleton.strategy.template;

import java.util.ArrayList;

/**
 *
 * @author pnkn0
 */
public interface ILoadData<T> {
    public ArrayList<T> loadData(String sql);
}
