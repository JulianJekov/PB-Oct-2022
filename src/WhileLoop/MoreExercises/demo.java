package WhileLoop.MoreExercises;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        String fullWord = "";
        String letersNCO = "";
        String text = scanner.nextLine();

        while (!text.equals("End")) {
            char input = text.charAt(0);
            if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
                if ((input == 'c')) {
                    if (letersNCO.contains("c")) {
                        word += input;
                    } else {
                        letersNCO += input;
                    }
                } else if ((input == 'n')) {
                    if (letersNCO.contains("n")) {
                        word += input;
                    } else {
                        letersNCO += input;
                    }
                } else if ((input == 'o')) {
                    if (letersNCO.contains("o")) {
                        word += input;
                    } else {
                        letersNCO += input;
                    }

                } else {
                    word += input;
                }
                if (letersNCO.contains("c") && (letersNCO.contains("o") && (letersNCO.contains("n")))) {
                    word += " ";
                    fullWord = word;
                    letersNCO = "";
                }
            }


            text = scanner.nextLine();
        }
        System.out.println(fullWord);
    }
}
