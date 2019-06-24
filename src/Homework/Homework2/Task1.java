package Homework.Homework2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<Integer, Product> products = new HashMap<Integer, Product>();
    public static ArrayList<Load> loadVan = new ArrayList<Load>();

    public static void main(String[] args) {

        createProducts();
        System.out.println("***************************");

        loadVan();
        System.out.println("***************************");
        sortByPrice();
        System.out.println("***************************");
        findByParameters();
    }

    public static void createProducts() {
        products.put(1, new Product("Arabica1", "ground", 100, "Type1", 20));
        products.put(2, new Product("Arabica2", "bean", 100, "Type1", 25));
        products.put(3, new Product("Arabica3", "instant", 200, "Type2", 25));
        products.put(4, new Product("Arabica4", "instant", 50, "Type3", 10));
        products.put(5, new Product("Robusta1", "ground", 150, "Type1", 50));
        products.put(6, new Product("Robusta2", "bean", 500, "Type1", 100));
        products.put(7, new Product("Robusta3", "instant", 25, "Type3", 15));
        products.put(8, new Product("Arabica5", "bean", 500, "Type1", 150));
        products.put(9, new Product("Arabica6", "instant", 20, "Type2", 5));
        products.put(10, new Product("Arabica7", "ground", 600, "Type2", 120));

        for (Map.Entry<Integer, Product> p : products.entrySet()) {
            System.out.println(p.getValue().getPackageValue());
        }

    }

    static Van van = new Van("Volvo", 1000, 2000);

    public static void loadVan() {
        double loadMaxValue = 0;
        double a = van.getMaxValue();

        loadVan.add(new Load("Load1", 1, 2));
        loadVan.add(new Load("Load2", 2, 3));
        loadVan.add(new Load("Load3", 3, 5));
        loadVan.add(new Load("Load4", 8, 20));
        loadVan.add(new Load("Load5", 10, 10));
        for (Load l : loadVan) {
            loadMaxValue += products.get(l.id).packageValue;
            if (loadMaxValue > van.maxValue) {
                System.out.println( "Overload is " + (loadMaxValue - van.maxValue));

            }


        }


    }


    public static void sortByPrice() {
        Comparator<Load> pcomp = new LoadCompareByPrice();
        loadVan.sort(pcomp);
        for (Load load : loadVan) {
            System.out.println(products.get(load.id).sort + products.get(load.id).packagePrice);
        }

    }

    public static void findByParameters() {
        for (Load l : loadVan) {
            if (products.get(l.id).kind.equals("ground")) {
                System.out.println(products.get(l.id).kind + products.get(l.id).sort + products.get(l.id).packagePrice);
            }
        }
    }

}

