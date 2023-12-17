package P02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodDay = Double.parseDouble(scanner.nextLine());
        double catFoodDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodDay = Double.parseDouble(scanner.nextLine());

        double allDogFood = days * dogFoodDay;
        double allCatFood = days * catFoodDay;
        double allTurtleFood = (days * turtleFoodDay) / 1000;
        double allFood = allCatFood + allDogFood + allTurtleFood;
        double foodLeft = food - allFood;
        double noFoodLeft = allFood - food;


        if(food >= allFood){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft));
        }else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(noFoodLeft));
        }


    }
}
