import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = 1;
        for (int row = 1; row <= n;m++, row++) {

            for (int col = 1; col <= n-row ; col++) {
                System.out.print(" ");
            }
            System.out.print(m);

            for (int col = 1; col < row  ; col++) {
                System.out.print(" "+ m);
            }
            System.out.println();
        }
        int b = n-1;
        for (int row = 1; row <= n - 1 ;b--, row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(" ");
            }
            for (int i =1; i <= n-row ; i++) {
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}
