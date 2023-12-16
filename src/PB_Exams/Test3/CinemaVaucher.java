package PB_Exams.Test3;

import java.util.Scanner;

public class CinemaVaucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vaucher = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int tickets = 0;
        int others = 0;
        int price = 0;


        while (!command.equals("End")){
            char letter1 = command.charAt(0);
            char letter2 = command.charAt(1);
            if(command.length()>8){
                price=letter1 + letter2;
            }else {
                price=letter1;
            }
            if(vaucher-price<0){
                break;
            }
            if(command.length()>8){
                tickets++;
            }else{
                others++;
            }
            vaucher-=price;
            command = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(others);
    }
}
