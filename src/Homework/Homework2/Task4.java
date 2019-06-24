package Homework.Homework2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {
    public static ArrayList<Double> list = new ArrayList<Double>();
    public static LinkedList<Double> linked = new LinkedList<Double>();

    public static void main(String[] args) {
        createCollection();
        removeCollection();
        findCollection();

    }

    private static void createCollection() {

        double time1 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            double number = Math.random();
            list.add(number);

        }
        double timeArrayList1000 = (System.currentTimeMillis() - time1) / 10000;
        System.out.println("time ArrayList 1000 add: " + timeArrayList1000);


        double time2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            double number = Math.random();
            linked.add(number);

        }
        double timeLinkedList1000 = (System.currentTimeMillis() - time2) / 10000;
        System.out.println("time LinkedList 1000 add: " + timeLinkedList1000);

        System.out.println("Difference Linked - Array = " + (timeLinkedList1000 - timeArrayList1000));
    }

    private static void removeCollection() {

        double time1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {

            list.remove(0);

        }
        double timeArrayList1000 = (System.currentTimeMillis() - time1) / 1;
        System.out.println("time ArrayList 1000 remove: " + timeArrayList1000);


        double time2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {

            linked.removeFirst();
        }
        double timeLinkedList1000 = (System.currentTimeMillis() - time2) / 1;
        System.out.println("time LinkedList 1000 remove: " + timeLinkedList1000);

        System.out.println("Difference Linked - Array = " + (timeLinkedList1000 - timeArrayList1000));
    }

    private static void findCollection() {

        int i = 0;
        int k = 0;
        double time1 = System.currentTimeMillis();
        while (k<1000) {
            if (list.get(i)< 0.005 ) {
                k++;
            }
            i++;
        }
        double searchArrayList1000 = (System.currentTimeMillis() - time1);
        System.out.println("search ArrayList 1000 : " + searchArrayList1000);

        int l = 0;
        int m = 0;
        double time2 = System.currentTimeMillis();
        while (m<1000) {
            if (list.get(l)< 0.005 ) {
                m++;
            }
            l++;
        }
        double searchLinkedList1000 = (System.currentTimeMillis() - time2);
        System.out.println("search LinkedList 1000 : " + searchLinkedList1000);
        System.out.println("Search difference = " + (searchLinkedList1000 - searchArrayList1000));

    }
}
