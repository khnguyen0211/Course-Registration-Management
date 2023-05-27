/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.adapter;

import designpattern.controllers.SubjectController;
import designpattern.factoryMethod.CreateController;
import designpattern.factoryMethod.FactoryMethod;
import designpattern.models.Subject;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnkn0
 */
public class ConvertData implements IConvertData {

    ReadDataFromFile rdff = new ReadDataFromFile();

    @Override
    public void readTextFile(String fileName) {
        
        String filePath = getPath();
        filePath = filePath.replaceAll("\\\\", "\\\\\\\\");
        filePath += "\\src\\designpattern\\data\\" + fileName;
        FactoryMethod method = new CreateController();
        var x = method.createController(fileName);
        System.out.println(x.getClass());
        if (x instanceof SubjectController) {
            SubjectController subCon = (SubjectController) x;
            String data = rdff.readTextFile(filePath);
            String[] dataArray = data.split(";");
            for (String subject : dataArray) {
                String[] element = subject.split(",");
                Subject sub = new Subject(element[0], element[1], element[2], Integer.parseInt(element[3]));
                try {
                    if (subCon.findSubjectById(sub.getSubjectId()) == null) {
                        subCon.insertSubject(sub);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ConvertData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    } //xử lí các trường hợp Student Controller, Subject Controller

    public String getPath() {
        Path currentRelativePath = Paths.get("");
        String relativePath = currentRelativePath.toAbsolutePath().toString();
        return relativePath;
    }

    public static void main(String[] args) {
        System.out.println(new ConvertData().getPath());
    }

}
