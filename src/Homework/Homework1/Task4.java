package Homework.Homework1;

import java.util.Scanner;
//	Выведите в консоль контур ромба из «*».
public class Task4 {
        public static void main(String[] args) {
        System.out.println();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number *: ");
        int n = in2.nextInt();

        int xMax = 2 * n - 1;//полная ширина фигуры
        int yMax = 2 * n - 1;//полная высота фмгуры, y=kx+b формула прямой

        for (int x = 0; x < xMax; x++) {

            for (int y = 0; y < yMax; y++) {

                if (y == yMax / 2 - x || y == x - yMax / 2 || y == x + yMax / 2 || y == xMax - x + xMax / 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
