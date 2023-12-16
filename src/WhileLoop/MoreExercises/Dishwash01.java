package WhileLoop.MoreExercises;
import java.util.Scanner;
public class Dishwash01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottlesOfDetergent = Integer.parseInt(scanner.nextLine());
        int detergentMils = numBottlesOfDetergent * 750;
        int numDishes = 0;
        int numPots = 0;
        int loads = 0;
        String command = scanner.nextLine();

        while(!command.equals("End")){
            int currentNum = Integer.parseInt(command);
            loads++;
            if(loads%3==0){
                numPots+=currentNum;
                detergentMils-=currentNum*15;
            }else{
                numDishes+=currentNum;
                detergentMils-=currentNum*5;
            }
            if(detergentMils<0){
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMils));
                break;
            }
            command = scanner.nextLine();
        }
        if(detergentMils>=0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", numDishes, numPots);
            System.out.printf("Leftover detergent %d ml.", detergentMils);
        }
    }
}