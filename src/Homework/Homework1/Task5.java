package Homework.Homework1;

import java.util.Scanner;
import java.util.regex.Pattern;
//	Создать игру "Угадай кто".
public class Task5 {
    public static void main(String[] args) {
        String b = "Svetlana Mironova";
        String c = "";
        for (int i = 0; i < b.length(); i++) {
            if (b.split("")[i].equals(" ")) {
                c += " ";
            } else {
                c+="*";
            }

        }
        while (c.contains("*")) {
            System.out.println(c);

            Scanner in = new Scanner(System.in);
            System.out.print("Enter the word or the letter: ");
            String a = in.nextLine();

            String regex = "[a-zA-Z\\s]+";
            Pattern pattern = Pattern.compile(regex);

            boolean isString  = pattern.matches(regex, a);
            if (!isString) {
                System.out.println("Enter the word or the letter");
            } else {
                int index1 = b.indexOf(a);
                if (index1 == -1) {
                    System.out.println("There is no such letter");
                } else {
                    System.out.println("You have guessed!");
                    String cUpdated = "";

                    for (int i = 0; i < b.length();) {
                        if (i != index1) {
                            char[] dst=new char[1];

                            c.getChars(i,i+1,dst,0);
                            //System.out.println("dst = "+ dst[0]);
                            cUpdated =  cUpdated + dst[0];
                            i++;
                        } else {
                            cUpdated =cUpdated + a;
                            i += a.length();
                        }
                        //System.out.println("cUpdated = "+ cUpdated);
                    }
                    c = cUpdated;
                }
            }

        }
        System.out.println("You win!");
    }
}

