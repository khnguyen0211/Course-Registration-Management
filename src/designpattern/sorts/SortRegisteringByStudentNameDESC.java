package designpattern.sorts;

import designpattern.models.Registration;
import java.util.Comparator;

public class SortRegisteringByStudentNameDESC implements Comparator<Registration> {

    @Override
    public int compare(Registration o1, Registration o2) {
        return o2.getStudent().getData().getFullName().compareTo(o1.getStudent().getData().getFullName());
    }
    
}
