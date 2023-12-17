package P03_ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numGroups = Integer.parseInt(scanner.nextLine());

        int musalla = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <=numGroups ; i++) {
            int numPeople = Integer.parseInt(scanner.nextLine());

            if(numPeople<=5){
                musalla +=numPeople;
            }else if(numPeople<=12){
                montblanc +=numPeople;
            }else   if(numPeople<=25){
                kilimanjaro +=numPeople;
            }else   if(numPeople<=40){
                k2+=numPeople;
            }else{
                everest+=numPeople;
            }

        }

        double sumNumPeople = musalla + montblanc + k2 + kilimanjaro + everest;

        double percentMusalla = musalla / sumNumPeople *100;
        double percentMomblan = montblanc / sumNumPeople *100;
        double percentKilimanjaro = kilimanjaro / sumNumPeople *100;
        double percentK2 = k2 / sumNumPeople *100;
        double percentEverest = everest / sumNumPeople *100;

        System.out.printf("%.2f%%%n", percentMusalla);
        System.out.printf("%.2f%%%n", percentMomblan);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);


    }
}