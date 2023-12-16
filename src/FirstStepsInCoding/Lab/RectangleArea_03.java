package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на входни данни
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        //Пресмятания на лицето на правоъгълника
        int area = a * b;
        //Принтиране на резултата
        System.out.println(area);

    }
}
