package Homework.Homework2;

import java.util.Comparator;

class StudentComparatorByAge implements Comparator<Student> {

    public int compare(Student a, Student b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}

