package Homework.Homework2;

import java.util.*;

public class Task2 {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static Map<Integer, Student> studentsMap = new HashMap<Integer, Student>();

    public static void main(String[] args) {

        students.add(new Student("Ivan", "Sidorov", 18));
        students.add(new Student("van2", "Fidorov8", 23));
        students.add(new Student("Yvan5", "Didorov5", 43));
        students.add(new Student("zvan4", "Gidorov4", 45));
        students.add(new Student("Kvan8", "Sidorov3", 23));
        students.add(new Student("Dvan6", "Midorov8", 64));
        students.add(new Student("Ivan6", "Sidorov5", 43));
        students.add(new Student("Ivan5", "Sidorov6", 33));
        students.add(new Student("Ivan4", "Sidorov3", 55));
        students.add(new Student("Ivan88", "Sidorov3", 67));


        compareStudentsByAge();
        System.out.println("************************");
        findStudentByLetter();
        System.out.println("************************");
        meanAge();
        System.out.println("************************");
        getMap();
        System.out.println("************************");
        getStudentById();

    }


    static void compareStudentsByAge() {
        Comparator<Student> pcomp = new StudentComparatorByAge();
        students.sort(pcomp);

        for (Student s : students) {

            System.out.println(s.getFirstName() + " " + s.getSecondName() + " " + s.getAge());


        }
    }


    static void findStudentByLetter() {
        ArrayList<Student> studentsWithLetter = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first letter of name: ");
        String firstLetter = in.nextLine();
        for (Student student : students) {
            if (student.getSecondName().startsWith(firstLetter)) {
                studentsWithLetter.add(student);
            }
        }
        for (Student student : studentsWithLetter) {
            System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getAge());
        }
    }


    static int meanAge() {
        int age = 0;
        int b = 0;

        for (Student p : students) {
            age = age + p.getAge();
            //b++;
            b = age / students.size();
        }
        System.out.println("average age is " + b);
        return age / b;


    }

    static Map<Integer, Student> getMap() {

        for (Student s : students) {
            studentsMap.put(s.getId(), new Student(s.getFirstName(), s.getSecondName(), s.getAge()));
        }


        for (Map.Entry<Integer, Student> item : studentsMap.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue().getFirstName() + " " + item.getValue().getSecondName() + " " + item.getValue().getAge());
        }
        return studentsMap;

    }

    static void getStudentById(){
        for(Map.Entry<Integer, Student> item : studentsMap.entrySet()){
            if(item.getKey()>4){
                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue().getFirstName() + " " + item.getValue().getSecondName() + " " + item.getValue().getAge());
            }
        }
    }

}

