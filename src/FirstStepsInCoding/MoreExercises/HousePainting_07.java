package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenPaint = 3.4;
        double redPaint = 4.3;
        double door = 2 * 1.2;
        double window = 1.5 * 1.5;
        double backWall = x * x;
        double frontWall = x * x - door;
        double sideWall = x * y - window;
        double houseBase = (2 * sideWall) + frontWall + backWall;
        double paintForBase = houseBase / greenPaint;
        double roofSide = 2* (x * y);
        double roofTriangle = 2 * (x * h /2);
        double roofBase = roofSide + roofTriangle;
        double paintForRoof = roofBase / redPaint;

        System.out.printf("%.2f%n%.2f", paintForBase, paintForRoof);





    }
}
