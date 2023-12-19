package P04_WhileLoop.Exercises;


import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neededBook = scanner.nextLine();
        String command = scanner.nextLine();
        int numCheckedBooks = 0;
        boolean isFound = false;

        while (!command.equals("No More Books")){
            if(command.equals(neededBook)) {
                isFound = true;
                break;
            }
            numCheckedBooks++;
            command = scanner.nextLine();
        }

        if(isFound){
            System.out.printf("You checked %d books and found it.", numCheckedBooks);
        }else{
            System.out.printf("The book you search is not here!%nYou checked %d books.", numCheckedBooks);
        }
    }
}
