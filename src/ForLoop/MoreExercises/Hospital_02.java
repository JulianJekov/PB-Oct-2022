package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int examined = 0;
        int unExamined = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int numOfPatients = Integer.parseInt(scanner.nextLine());
            if ((i % 3 == 0) && (unExamined > examined)) {
                doctors++;
            }

                if (numOfPatients <= doctors) {
                    examined += numOfPatients;
                } else {
                    unExamined += numOfPatients - doctors;
                    examined += doctors;
                }
            }
            System.out.printf("Treated patients: %d.%n", examined);
            System.out.printf("Untreated patients: %d.", unExamined);
        }
    }
