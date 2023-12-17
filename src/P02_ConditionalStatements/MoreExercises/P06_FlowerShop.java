package P02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int zumbul = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int kaktus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double order = (magnolia * 3.25 + zumbul * 4 + rose * 3.5 + kaktus * 8) * 0.95;

        if(order >= giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(order - giftPrice));
        }else{
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(giftPrice - order));
        }

    }
}
