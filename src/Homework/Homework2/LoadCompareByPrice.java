package Homework.Homework2;

import java.util.Comparator;

public class LoadCompareByPrice implements Comparator<Load> {


        public int compare(Load a, Load b){

            if(Task1.products.get(a.id).packagePrice > Task1.products.get(b.id).packagePrice)
                return 1;
            else if(Task1.products.get(a.id).packagePrice< Task1.products.get(b.id).packagePrice)
                return -1;
            else
                return 0;
        }
    }

