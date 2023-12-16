package PB_Exams.Test;

import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;

        String contractDuration = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());


        if(typeContract.equals("Small")){
            if (contractDuration.equals("one")) {
                price=9.98;
            }else if(contractDuration.equals("two")){
                price = 8.58;
            }
            if(internet.equals("yes")){
                price+= 5.5;
            }
        }else if(typeContract.equals("Middle")){
            if(contractDuration.equals("one")){
                price = 18.99;
            }else if(contractDuration.equals("two")){
                price = 17.09;
            }
            if(internet.equals("yes")){
                price+=4.35;
            }
        }else if(typeContract.equals("Large")){
            if(contractDuration.equals("one")){
                price=25.98;
            }else if(contractDuration.equals("two")){
                price = 23.59;
            }
            if(internet.equals("yes")){
                price+=4.35;
            }
        }else if(typeContract.equals("ExtraLarge")){
            if(contractDuration.equals("one")){
                price=35.99;
            }else if(contractDuration.equals("two")){
                price = 31.79;
            }
            if(internet.equals("yes")){
                price+=3.85;
            }
        }
        if(contractDuration.equals("two")){
            price = price * 0.9625;
        }

        double finalPrice = price * months;
        System.out.printf("%.2f lv.", finalPrice);
    }
}
