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
public class StrategyDAO<T> {

    private String sql;
    private T data;
    private ILoadData loadDataStrategy;
    private IManipulationData manipulationData;

    private static StrategyDAO uniqueInstance;

    private StrategyDAO() {
    }

    public static synchronized StrategyDAO getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StrategyDAO();
        }
        return uniqueInstance;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLoadDataStrategy(ILoadData loadDataStrategy) {
        this.loadDataStrategy = loadDataStrategy;
    }

    public void setManipulationData(IManipulationData manipulationData) {
        this.manipulationData = manipulationData;
    }

    public ArrayList<T> loadData() {
        return loadDataStrategy.loadData(sql);
    }

    public boolean manipulationData() {
        return manipulationData.ManipulationData(data, sql);
    }

}
