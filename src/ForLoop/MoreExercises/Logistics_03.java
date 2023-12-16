package ForLoop.MoreExercises;
import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int buss = 0;
        int truck = 0;
        int train = 0;

        for (int i = 1; i <=n ; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            if(tons<=3){
                buss+=tons;

            }else if(tons<=11){
                truck+=tons;
            }else{
                train+=tons;
            }
        }
        int allTons = buss + truck + train;
        int allTonsPrice = buss*200 + truck*175 + train*120;
        double averageTonPrice = 1.0*allTonsPrice/allTons;
        double percentBuss = 1.0* buss/allTons *100;
        double percentTruck = 1.0* truck/allTons *100;
        double percentTrain = 1.0* train/allTons *100;
        System.out.printf("%.2f%n",averageTonPrice);
        System.out.printf("%.2f%%%n",percentBuss);
        System.out.printf("%.2f%%%n",percentTruck);
        System.out.printf("%.2f%%%n",percentTrain);
    }
}