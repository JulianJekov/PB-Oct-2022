import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < Math.ceil(n / 2.0); i++) {
            String dash = "";
            for (int j = 0; j < (n - 1) / 2; j++) {
                dash += "-";
            }
                System.out.print(dash);

            if (n % 2 == 0 && i==0) {

                System.out.print("**");
            } else {
                if(i==0) {
                    System.out.print("*");
                }
            }
            System.out.print(dash);

        System.out.println();
            for (int j = 0; j < n; j++) {
                
            }
            }

        }

    }

