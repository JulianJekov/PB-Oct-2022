package P06_ExamProblems;


import java.util.Scanner;

public class From_ExamP04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        int walls = 4;
        int area = walls * length * width;

        double areaMinusPercent = Math.ceil(area - ((1.0*area * percent) / 100));

        String command = scanner.nextLine();
        while (!command.equals("Tired!")) {
            int liters = Integer.parseInt(command);
            areaMinusPercent -= liters;
            if (areaMinusPercent <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if(areaMinusPercent==0){
            System.out.println("All walls are painted! Great job, Pesho!");
        }else if(areaMinusPercent<0){
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(areaMinusPercent));
        }else {
            System.out.printf("%.0f quadratic m left.", areaMinusPercent);
        }
    }
}










