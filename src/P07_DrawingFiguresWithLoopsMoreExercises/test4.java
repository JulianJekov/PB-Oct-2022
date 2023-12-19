package P07_DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n+1; i++) {

            String spaces = "";
            for (int j = 0; j <n-i ; j++) {
                spaces+= " ";
            }
            System.out.print(spaces);

            String stars = "";
            for (int j = 0; j < i; j++) {
                stars+= "*";
            }
            System.out.print(stars);
            System.out.print(" | ");
            System.out.print(stars);

            System.out.println();
        }


    }
    static String repeatString (String strToRepeat ,int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text+= strToRepeat;
        }
        return text;
    }
}
