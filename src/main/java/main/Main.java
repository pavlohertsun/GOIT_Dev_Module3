package main;

import utils.SumCalculator;

public class Main {
    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        System.out.println(calc.sum(1));
        System.out.println(calc.sum(3));
        try{
            calc.sum(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
}
