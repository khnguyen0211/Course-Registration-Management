/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.manipulationData;

import designpattern.daos.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public abstract class ManipulationDataTemplate<T> {

    ConnectDatabase cd;
    Connection conn;
    PreparedStatement sttm;
    

    public PreparedStatement openConnect(String sql) throws SQLException {
        this.cd = new ConnectDatabase();
        this.conn = cd.getConnection();
        this.sttm = conn.prepareStatement(sql);
        return sttm;
    }

    protected abstract T createInstance();

    protected abstract void setFields(T instance, PreparedStatement sttm, String request) throws SQLException;

    public void closeConnect() throws SQLException {
        this.sttm.close();
        this.conn.close();
    }
    
    public boolean manipulationData(T data, String sql) throws SQLException {
        String request = sql.split(" ")[0];
        this.sttm = openConnect(sql);
        setFields(data, sttm, request);  //tạo template method ở đây
        if(sttm.executeUpdate() > 0) {
           return true;
        }
        return false;
    }
}
