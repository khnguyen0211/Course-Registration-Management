package designpattern.sorts;

import designpattern.models.Registration;
import java.util.Comparator;

public class SortRegisteringByStudentNameASC implements Comparator<Registration> {

    @Override
    public int compare(Registration o1, Registration o2) {
        return o1.getStudent().getData().getFullName().compareTo(o2.getStudent().getData().getFullName());
    }
    
}
