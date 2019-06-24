package Homework.Homework1;

import java.util.Scanner;

public class Task2 {
    //	Введите номер дня недели и выведите название этого дня.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of day: ");
        int num = in.nextInt();

        switch (num) {

            case 1:
                System.out.println("the day of the week is Sunday");
                break;
            case 2:
                System.out.println("the day of the week is Monday");
                break;
            case 3:
                System.out.println("the day of the week is Tuesday");
                break;
            case 4:
                System.out.println("the day of the week is Wednesday");
                break;
            case 5:
                System.out.println("the day of the week is Thursday");
                break;
            case 6:
                System.out.println("the day of the week is Friday");
                break;
            case 7:
                System.out.println("the day of the week is Saturday");
                break;
            default:
                System.out.println("the number is incorrect");
        }

    }
}
