package PB_Exams.Test_02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePlus20Kg = Double.parseDouble(scanner.nextLine());
        double kilos = Double.parseDouble(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int numBags = Integer.parseInt(scanner.nextLine());

        double price=0;

        if(kilos<10){
            price=pricePlus20Kg*0.2;
        }else if(kilos<=20){
            price=pricePlus20Kg*0.5;
        }else {
            price=pricePlus20Kg;
        }
        if(daysLeft>30){
            price=price*1.1;
        }else if(daysLeft>=7){
            price=price*1.15;
        }else {
            price=price*1.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.",price*numBags);
    }
}
