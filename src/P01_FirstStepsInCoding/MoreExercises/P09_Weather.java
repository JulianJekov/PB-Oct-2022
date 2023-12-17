package P01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P09_Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

        if(weather.equals("sunny")){
            System.out.println("It's warm outside!");
        }else if(weather.equals("cloudy")){
            System.out.println("It's cold outside!");
        }else{
            System.out.println("It's cold outside!");
        }

    }
}
