package org.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
//        if (st1.getAge() < st2.getAge()) return -1;
//        if (st1.getAge() > st2.getAge()) return 1;
//        return 0;
        return Integer.compare(st1.getAge(), st2.getAge()); // same as above
    }
}
