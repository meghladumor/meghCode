package com.meghcode;

public class Method {
    private static int add(int n1, int n2){ // method example which adds two numbers , here n1 n2 are the parameters
        int result = n1 +n2;
        return result;
    }
    private static void printBrand(){
        System.out.println("Meghcode");   // as it dosent return anything we have it as void and the return is not needed :)
    }
    private static void printBrand2(String brand){
        System.out.println(brand.toUpperCase()); // this method dosent return anything here , it just perform an action to print
    }

    private static void isAdult(int age){
        if(age>=16){
            System.out.println("adult");
        }else{
            System.out.println("Not Adult");
        }
    }
    private static double yielde(double rentalIncome,double propertyRate){
        double rentalyield = ((rentalIncome * 12 )/propertyRate)*100;
        return rentalyield;
    }
    public static void main(String[] args) {
        int result = add(10,10); // only a static method can call a static , the other way is to create an Object
        System.out.println(result);
        int result2= add(10,100); // 10,100 are the arguments
        System.out.println(result2);
        printBrand();
        printBrand2("Meghcode");
        isAdult(6);
        isAdult(17);
        double yield1 = yielde(1300.0,250000.0);
        System.out.println(yield1 + "%");
    }
}

