/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.strategy.registration;

import designpattern.models.Registration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class SearchByReigsterTime implements ISearching {

    @Override
    public ArrayList<Registration> search(ArrayList<Registration> data, String fromDate, String toDate) {
        fromDate = stringDate(fromDate, "00:00:00.000");
        toDate = stringDate(toDate, "23:59:59.999");
        ArrayList<Registration> result = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        try {
            Date from = formatter.parse(fromDate);
            Date to = formatter.parse(toDate);

            for (Registration regis : data) {
                Date date = formatter.parse(regis.getRegistrationDate());

                if (date.after(from) && date.before(to)) {
                    result.add(regis);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public String stringDate(String s, String tail) {
        String[] list = s.split("/");
        String result = list[2] + "-" + list[1] + "-" + list[0] + " " + tail;
        return result;
    }
//    public ArrayList<Registration> search(ArrayList<Registration> data, String fromDate, String toDate) {
//        ArrayList<Registration> result = new ArrayList<>();
//        SimpleDateFormat inputFormatter = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        try {
//            Date from = outputFormatter.parse(inputFormatter.format(fromDate) + " 00:00:00.000");
//            Date to = outputFormatter.parse(inputFormatter.format(toDate) + " 23:59:59.999");
//
//            for (Registration regis : data) {
//                Date date = outputFormatter.parse(regis.getRegistrationDate());
//
//                if (date.after(from) && date.before(to)) {
//                    result.add(regis);
//                }
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }

}
