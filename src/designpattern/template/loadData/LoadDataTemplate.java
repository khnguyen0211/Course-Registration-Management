/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.loadData;

import designpattern.daos.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author pnkn0
 * @param <T>
 */
public abstract class LoadDataTemplate<T> {
    ConnectDatabase cd;
    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ResultSet openConnect(String sql) throws SQLException {
        this.cd = new ConnectDatabase();
        this.conn = cd.getConnection();
        this.sttm = conn.prepareStatement(sql);
        this.rs = sttm.executeQuery();
        return rs;
    }
    
    protected abstract T createInstance();
    
    protected abstract void setFields(T instance, ResultSet rs) throws SQLException;
    
    public void closeConnect() throws SQLException {
        this.rs.close();
        this.sttm.close();
        this.conn.close();
    }
    
    public ArrayList<T> loadData(String sql) throws SQLException {
        ArrayList<T> list = new ArrayList<>();
        this.rs = openConnect(sql);
        while (rs.next()) {
            T instance = (T) createInstance();
            setFields(instance, rs);
            list.add(instance);
        }
        closeConnect();
        return list;
    }
}
