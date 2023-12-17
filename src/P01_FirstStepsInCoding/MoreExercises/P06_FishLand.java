package P01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06_FishLand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceOfSkumriq = Double.parseDouble(scanner.nextLine());
        double priceOfCaca = Double.parseDouble(scanner.nextLine());

        double kiloPalamud = Double.parseDouble(scanner.nextLine());
        double kiloSafrid = Double.parseDouble(scanner.nextLine());
        int kiloMidi = Integer.parseInt(scanner.nextLine());

        double priceOfKiloPalamud = priceOfSkumriq + priceOfSkumriq * 0.60;
        double priceOfPalamud = kiloPalamud * priceOfKiloPalamud;

        double priceOfKiloSafrid = priceOfCaca + priceOfCaca * 0.80;
        double priceOfSafrid = kiloSafrid * priceOfKiloSafrid;


        double priceOfMidi = kiloMidi * 7.50;

        double fullPrice = priceOfMidi + priceOfPalamud + priceOfSafrid;
        System.out.println(String.format("%.2f", fullPrice));




    }



}

