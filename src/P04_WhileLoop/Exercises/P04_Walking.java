package P04_WhileLoop.Exercises;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //четем команда/брой стъпки от конзолата
        //правим цикъл в който четем стъпките които тя е извървяла
        //правим проверка дали е постигнала  10 000 стъпки

        String command = scanner.nextLine();

        int sumSteps = 0;

        while(!command.equals("Going home")){
            int  currentSteps = Integer.parseInt(command);
            sumSteps+=currentSteps;

            if(sumSteps >= 10000){

                break;
            }

            command = scanner.nextLine();
        }

        if(command.equals("Going home")){
            int stepsToHome =  Integer.parseInt(scanner.nextLine());
            sumSteps+=stepsToHome;
        }
        if(sumSteps>=10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        }else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
