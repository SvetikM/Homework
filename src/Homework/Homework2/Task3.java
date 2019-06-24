package Homework.Homework2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task3 {

    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        students.add(new Student("Ivan", "Ivanov", 18));
        students.add(new Student("Ivan", "Petrov", 19));
        students.add(new Student("Alex", "Sidorov", 21));
        students.add(new Student("Roman", "Abramov", 20));
        students.add(new Student("Alex", "Mironov", 18));
        students.add(new Student("Ludmila", "Adamovich", 17));
        students.add(new Student("Pavel", "Adamovich", 22));

        sortByAge();
        System.out.println("********************************");
        filterByFirstName();
        System.out.println("********************************");
        meanAge();
        System.out.println("********************************");
        getMap();
        System.out.println("********************************");
        filterMapById();


    }

    static void sortByAge() {
        Stream<Student> studentsStream = students.stream();
        studentsStream.sorted(new StudentComparatorByAge()).forEach(s -> System.out.println(s.getFirstName() + " " + s.getSecondName() + " " + s.getAge()));
    }

    static void filterByFirstName() {
        Stream<Student> studentsStream = students.stream();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first letter of name: ");
        String firstLetter = in.nextLine();
        studentsStream.filter(s -> s.getFirstName().startsWith(firstLetter)).forEach(s -> System.out.println(s.getFirstName() + " " + s.getSecondName() + " " + s.getAge()));
    }

    static void meanAge() {

        Stream<Student> studentsStream = students.stream();
        long sum = studentsStream.mapToLong(s -> s.getAge()).sum();
        long count = students.stream().count();
        System.out.println(sum / count);

    }

    static void getMap() {
        Stream<Student> studentsStream = students.stream();
        Map<Integer, String> students = studentsStream
                .collect(Collectors.toMap(p -> p.getId(), t -> t.getFirstName() + " " + t.getSecondName() + " " + t.getAge()));
        students.forEach((k, v) -> System.out.println(k + " " + v));

    }

    static void filterMapById() {
        Stream<Student> studentsStream = students.stream();
        Map<Integer, String> students = studentsStream.filter(s -> s.getId() < 5).collect(Collectors.toMap(p -> p.getId(), t -> t.getFirstName() + " " + t.getSecondName() + " " + t.getAge()));
        students.forEach((k, v) -> System.out.println(k + " " + v));
    }


}









