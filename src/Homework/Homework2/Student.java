package Homework.Homework2;

public class Student {
    private int id;
    static int counter = 1;
    private int age;
    private String firstName;
    private String secondName;

    Student(String firstName, String secondName, int age) {
        id = counter++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }


    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

}
