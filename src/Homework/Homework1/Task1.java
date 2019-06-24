package Homework.Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: Мама мыла раму ");
        String name = in.nextLine();

        System.out.printf("Your text: %s \n", name);
        in.close();



        StringBuffer strBuffer = new StringBuffer(name);
        strBuffer.reverse();
        System.out.println(strBuffer.toString());

        String str = name;
        String replStr1 = str.replace(" ","*");
        System.out.println(replStr1.toString());

        String str4 = name;
        System.out.println(str4.toUpperCase());

        String text = name;
        String[] words = text.split(" ");
        for(String word : words) {
            System.out.println(word);
        }
        String str5 = name;
        int start = 5;
        int end = 10;
        char[] dst=new char[end - start];
        str5.getChars(start, end, dst, 0);
        System.out.println(dst); // world

        String str6 = name;
        String substr2 = str6.substring(5,10);
        System.out.println(substr2);


    }
}

