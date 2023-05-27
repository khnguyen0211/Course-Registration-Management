package designpattern.sorts;

import designpattern.models.Registration;
import java.util.Comparator;

public class SortRegisteringByRegisterTimeDESC implements Comparator<Registration> {

    @Override
    public int compare(Registration o1, Registration o2) {
        return o2.getRegistrationDate().compareTo(o1.getRegistrationDate());
    }
    
}
