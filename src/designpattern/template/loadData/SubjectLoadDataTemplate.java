/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.template.loadData;

import designpattern.models.Subject;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pnkn0
 */
public class SubjectLoadDataTemplate extends LoadDataTemplate<Subject> {

    @Override
    public Subject createInstance() {
        return new Subject();
    }

    @Override
    protected void setFields(Subject instance, ResultSet rs) throws SQLException {
        instance.setSubjectId(rs.getString("subjectId"));
        instance.setSubjectName(rs.getString("subjectName"));
        instance.setSubjectType(rs.getString("subjectType"));
        instance.setCredit(rs.getInt("credit"));   
    }

}
