/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pnkn0
 */
public class Validator implements IValidator {

    @Override
    public boolean checkFill(String s) {
        if (s.trim().length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkCredit(String s) {
        if (s != null && s.length() > 0) {
            var regex = "^[0-9]+$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                int credit = Integer.parseInt(s);
                if (credit >= 0 && credit <= 10) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean isStringCharacter(String name) {
        if (name != null && name.length() > 0) {
            var regex = "^(\\w+.*[^0-9].*){2,40}$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean checkSubjectID(String subjectID) {
        if (subjectID != null && subjectID.length() > 0) {
            var regex = "^[0-9]+$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(subjectID);
            if (matcher.matches() && subjectID.length() == 6) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean checkCMND(String s) {
        if (isStringNumber(s)) {
            if (s.trim().length() == 10) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean checkEmail(String email) {
        var regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkPhoneNumber(String s) {
        var regex = "^(03|05|07|08|09|01[2|6|8|9])+([0-9]{8})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isStringNumber(String s) {
        var regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkStudentId(String s) {
        if (isStringNumber(s)) {
            if (s.trim().length() == 8) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean checkStudentClass(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkBirthday(String s) {
//        String regex = "^(?:\\d{4}\\/(?:(?:(?:(?:0[13578]|1[02])\\/(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)\\/(?:0[1-9]|[1-2][0-9]|30))|(?:02\\/(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)\\/02\\/29)$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//        if (matcher.matches()) {
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }

}
