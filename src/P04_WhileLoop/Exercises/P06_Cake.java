package P04_WhileLoop.Exercises;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int countPieces = width * length;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            countPieces -= currentPieces;

            if(countPieces <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
                break;
            }

            command = scanner.nextLine();
        }

        if(countPieces >0){
            System.out.printf("%d pieces are left.", countPieces);
        }


    }
}
