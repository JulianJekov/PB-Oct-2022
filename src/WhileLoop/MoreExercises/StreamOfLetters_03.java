package WhileLoop.MoreExercises;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        String textName = "";
        String textAfterCommand = "";

        String letters = "";

        while (!"End".equals(text)) {
            String texstName = scanner.nextLine();
            if ("End".equals(texstName)) {
                text = "End";
            } else {
                char input = texstName.charAt(0);
                if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {

                    if (input == ('c')) {
                        if (letters.contains("c") ) {
                            textName += input;
                        } else {
                            letters += input;
                        }
                    } else if (input == ('n') ) {
                        if (letters.contains("n") ) {
                            textName += input;
                        } else {
                            letters += input;
                        }
                    } else if (input == ('o') ) {
                        if (letters.contains("o") ) {
                            textName += input;
                        } else {
                            letters += input;
                        }
                    } else {
                        textName += input;
                    }

                    if ((letters.contains("c") ) && (letters.contains("o") ) && (letters.contains("n") )) {
                        textName += " ";
                        textAfterCommand = textName;
                        letters = "";
                    }
                }
            }
        }
        System.out.println(textAfterCommand);
    }
}
