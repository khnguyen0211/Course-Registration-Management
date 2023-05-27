/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.validation;

/**
 *
 * @author pnkn0
 */
public interface IValidator {
    public boolean checkFill(String s);
    public boolean checkCredit(String s);
    public boolean isStringCharacter(String s);
    public boolean isStringNumber(String s);
    public boolean checkSubjectID(String s);
    public boolean checkCMND(String s);
    public boolean checkEmail(String s);
    public boolean checkPhoneNumber(String s);
    public boolean checkStudentId(String s);
    public boolean checkStudentClass(String s);
    public boolean checkBirthday(String s);
}
