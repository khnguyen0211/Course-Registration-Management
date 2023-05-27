package designpattern.sorts;

import designpattern.models.Subject;
import java.util.Comparator;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortSubjectByNameDESC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o2.getSubjectName().compareTo(o1.getSubjectName());
    }

}
