package P07_DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 2; i++) {
            String row = "";
            if (i % 2 == 0) {
                row += repeatStr("*", n - 2) + "\\ /" + repeatStr("*", n - 2);
            } else {
                row += repeatStr("-", n - 2) + "\\ /" + repeatStr("-", n - 2);
            }

            System.out.println(row);
        }
        System.out.println(repeatStr(" ", n-2) + " @" +repeatStr(" ", n-2) );
        for (int i = 0; i < n-2; i++) {
            String rowTwo = "";
            if (i % 2 == 0) {
                rowTwo += repeatStr("*", n - 2) + "/ \\" + repeatStr("*", n - 2);
            } else {
                rowTwo += repeatStr("-", n - 2) + "/ \\" + repeatStr("-", n - 2);
            }

            System.out.println(rowTwo);

        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }

}