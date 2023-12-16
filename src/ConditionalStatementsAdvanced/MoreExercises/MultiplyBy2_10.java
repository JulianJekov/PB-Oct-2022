package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i>=0; i++) {
            double n = Double.parseDouble(scanner.nextLine());
            if(n>=0){
                System.out.printf("Result: %.2f%n", n*2);
            }else{
                System.out.println("Negative number!");
                break;
            }

        }

    }
}
