package designpattern.sorts;

import designpattern.models.Student;
import java.util.Comparator;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortStudentByIdASC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentId().compareTo(o2.getStudentId());
    }
    
}
