package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //switch спрямо месеца за почивка
        //пресмятаме цената за апартамент и цената за студио спрямо месеца
          //в зависимост от бтоя нощувки трябва да пресметнем отстъпката

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceForApartment = 0;
        double priceForStudio = 0;

        switch (month){
            case"May":
            case"October":
                priceForApartment = countNights * 65;
                priceForStudio = countNights * 50;
                if(countNights > 7 && countNights <=14){
                    priceForStudio = priceForStudio * 0.95;
                }else if(countNights > 14){
                    priceForStudio = priceForStudio * 0.70;
                    priceForApartment = priceForApartment * 0.90;
                }

                break;
            case"June":
            case"September":
                priceForApartment = countNights * 68.70;
                priceForStudio = countNights * 75.20;
                if(countNights > 14){
                    priceForStudio = priceForStudio * 0.80;
                    priceForApartment = priceForApartment * 0.90;
                }
                break;
            case"July":
            case"August":
                priceForApartment = countNights * 77;
                priceForStudio = countNights * 76;
                if(countNights > 14){
                    priceForApartment = priceForApartment * 0.90;
                }
                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);

    }
}
