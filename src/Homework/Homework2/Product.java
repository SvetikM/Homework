package Homework.Homework2;

public class Product {
    //String productId;
    String sort;
    String kind;
    double packageValue;
    String packageType;
    double packagePrice;

    Product(String sort,String kind, double packageValue,String packageType, double packagePrice){
        //d = productId;
        this.sort=sort;
        this.kind=kind;
        this.packageValue=packageValue;
        this.packageType=packageType;
        this.packagePrice=packagePrice;
    }
    public double getPackageValue(){return packageValue;}
}
