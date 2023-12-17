package P01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double areaOfCircle = Math.PI*Math.pow(r,2);
        double perimeterOfCircle = 2*Math.PI * r;

        System.out.printf("%.2f%n%.2f", areaOfCircle, perimeterOfCircle);



    }
}
