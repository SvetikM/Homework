package Homework.Homework2;

public  class Van {
    String vanName;
    double maxValue;
    double maxPrice;
    Van(String vanName,double maxValue,double maxPrice){
        this.vanName=vanName;
        this.maxValue=maxValue;
        this.maxPrice=maxPrice;
    }
    public double getMaxValue(){
        return maxValue;
    }
}
