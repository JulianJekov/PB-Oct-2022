package P06_ExamProblems.PB_Exams.Test3;

import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int tax = Integer.parseInt(scanner.nextLine());

      double statuette = tax * 0.7;
      double catering = statuette * 0.85;
      double soundSystem = catering / 2;
      double fullPrice = tax + statuette + catering + soundSystem;


        System.out.printf("%.2f", fullPrice);

    }
}






