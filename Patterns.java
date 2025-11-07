
//  Class author:  Verona M Gerolmini Bianchimano
//  Date created:  10/30/2025
//  General description: Patterns' class have some methods that, by while and for loops, create
//                       patterns depending on the arguments on them.





public class Patterns {


    // Pre-condition: The parameter rows must be a positive integer greater than 0.
    //                The method assumes rows is reasonably small to prevent extremely
    //                long console output.

    // Post-condition: Prints a triangle of stars to the console.
    //                 Each line contains an odd number of stars, starting with 1 on the
    //                 first line, and increasing by 2 stars on each subsequent line.
    //                 The pattern continues for 'rows' lines.

    public static void stars (int rows) {
        String stars = "*";
        int currentRow = 1;
        while (currentRow <= rows) {
            currentRow++;
            System.out.println(stars);
            stars += "**";
        }
    }


    // Pre-condition: The parameter rows must be a positive integer greater than 0.
    //                The method assumes rows is reasonably small to prevent extremely
    //                long console output.

    // Post-condition: Prints a triangle pattern to the console where each line contains the
    //                 line number repeated as many times as the line number itself.
    //                 The triangle starts with 1 on the first line, 2 on the second line,
    //                 and so on up to 'rows'.

    public static void triangle(int rows) {
        int num = 1;
        String line = "";
        while (num <= rows) {
            while (line.length() < num) {
                line += num;
            }
            System.out.println(line);
            line = "";
            num++;
        }
    }
   

    // Pre-condition: The parameter start must be a positive integer greater than 0.
    //                The method assumes start is reasonably small to prevent extremely
    //                long console output.

    // Post-condition: Prints a descending pattern of odd numbers to the console.
    //                 Each line contains the same number repeated as many times as its value.
    //                 The sequence decreases by 2 each line until reaching 1 (or 0 if the
    //                 start was even and included 0).

    public static void odds(int start){
        for(int i = start; i >= 0; i -= 2) {
            String text = "";
            for(int j = 0; j < i; j ++) {
                text += i;
            }
            System.out.println(text);
        }
    }


    // Pre-condition: The parameter maxE must be a positive integer greater than 0.
    //                The method assumes maxE is reasonably small to prevent extremely
    //                long console output.

    // Post-condition: Prints a pattern of lines to the console in which the characters "O" and "E" 
    //                 alternate each line. The number of characters per line increases from 1 up
    //                 to maxE and then decreases back down to 1. 
    //                 Starts with "O" if maxE is even, or "E" if maxE is odd.

    public static void eo(int maxE) {
        String letter = "";
        if(maxE % 2 == 0) {
            letter = "O";
        } else {
            letter = "E";
        }

        // increasing
        for (int i = 1; i <= maxE; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            System.out.println();

            // Cange between "O" and "E"
            if (letter.equals("O")) {
                letter = "E";
            } else {
                letter = "O";
            }
        }

        // decreasing
        for (int i = maxE - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            System.out.println();

            // Cange between "O" and "E"
            if (letter.equals("O")) {
                letter = "E";
            } else {
                letter = "O";
            }
        }
    }


    //  Pre-condition: The parameter rows must be a positive integer greater than 0.
    //                 The method assumes rows is reasonably small to prevent extremely
    //                 long console output.

    //  Post-condition: Prints a numeric pattern to the console in which each line starts with
    //                  one more leading space than the previous line, and the number of digits
    //                  decreases by 2 per line.
    //                  The digits printed on each line correspond to the current line number.
    //                  The pattern ends when the number of digits reaches 1 on the last line.

    public static void pyramid(int rows){
        int lines = (rows * 2) - 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= lines; k++) {
                System.out.print(i);
            }
            System.out.println();
            lines -= 2;
        }
    }
    
    public static void main(String[]args) {
        stars (7);
        triangle(9);
        odds(9);
        eo(6);
        pyramid(5);
    }

}
