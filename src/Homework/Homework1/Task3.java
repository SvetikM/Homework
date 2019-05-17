package Homework.Homework1;

import java.util.Scanner;
//	Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
public class Task3 {
       public static void main(String[] args) {

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};


        for (int i = names.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (time[j] > time[j + 1]) {
                    int tempTime = time[j];
                    time[j] = time[j + 1];
                    time[j + 1] = tempTime;
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }


        for (int i = 0; i < names.length; ) {
            System.out.printf("name: %s  time: %d  \n", names[i], time[i]);
            i++;
        }

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a number of place: ");
        int place = in1.nextInt();
        System.out.printf("name: %s  time: %d  \n", names[place - 1], time[place - 1]);

    }
}
