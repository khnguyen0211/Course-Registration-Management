package designpattern.sorts;

import designpattern.models.Subject;
import java.util.Comparator;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortSubjectByNameASC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getSubjectName().compareTo(o2.getSubjectName());
    }

}
