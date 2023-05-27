/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.registration;

import designpattern.models.Registration;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pnkn0
 */
public class SearchByRegistrationName implements ISearching{

    public ArrayList<Registration> search(ArrayList<Registration> regisList, String s, String k) {
        ArrayList<Registration> findedRegistration = new ArrayList<>();
        s = s.toLowerCase();
        for (Registration stu : regisList) {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(stu.getStudent().getData().getFullName().toLowerCase());
            if (matcher.find()) {
                findedRegistration.add(stu);
            }
        }
        return findedRegistration;
    }
}
