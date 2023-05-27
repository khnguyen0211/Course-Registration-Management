package designpattern.sorts;

import designpattern.models.Student;
import java.util.Comparator;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortStudentByIdDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getStudentId().compareTo(o1.getStudentId());
    }
    
}
