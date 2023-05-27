/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pnkn0
 */
public class GetRegisterTime {

    String getTime() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDate = formatter.format(currentDate);
        return formattedDate;
    }

}
