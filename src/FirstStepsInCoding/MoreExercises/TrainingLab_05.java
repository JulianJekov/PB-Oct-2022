package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hInMeters = Double.parseDouble(scanner.nextLine());
        double wInMeters = Double.parseDouble(scanner.nextLine());
        double hInCm = hInMeters * 100;
        double wInCm = wInMeters * 100;
        double wNoCoridor = wInCm - 100;
        double restW = wNoCoridor % 70;
        double wForPlaces = wNoCoridor - restW;
        double placesW = wForPlaces / 70;
        double restH = hInCm % 120;
        double hForPlaces = hInCm -restH;
        double placesH = hForPlaces / 120;
        double places = (placesH * placesW) - 3;
        System.out.println(Math.round(places));







    }

}
