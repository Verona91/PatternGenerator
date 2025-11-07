
//  Class author:  Verona M Gerolmini Bianchimano
//  Date created:  10/30/2025
//  General description: a brief summary of what this particular class does.





public class Patterns {
    //preonditon
    //poscondition


    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.

    public static void stars (int rows) {
        String stars = "*";
        int currentRow = 1;
        while (currentRow <= rows) {
            currentRow++;
            System.out.println(stars);
            stars += "**";
        }
    }

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
   
    public static void odds(int start){
        for(int i = start; i >= 0; i -= 2) {
            String text = "";
            for(int j = 0; j < i; j ++) {
                text += i;
            }
            System.out.println(text);
        }
    }


    public static void eo(int maxE) {
        // la e siempre es la mas larga
        // maxE es el numero de lineas asta que llega a la E mas larga
        String letter = "";
        if(maxE % 2 == 0) {
            letter = "O";
        } else {
            letter = "E";
        }

        for (int i = 1; i <= maxE; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            System.out.println();

            // Cambiar entre "O" y "E"
            if (letter.equals("O")) {
                letter = "E";
            } else {
                letter = "O";
            }
        }

        for (int i = maxE - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            System.out.println();

            // Cambiar entre "O" y "E"
            if (letter.equals("O")) {
                letter = "E";
            } else {
                letter = "O";
            }
        }
    }

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



 // numero de lines por 2 menos 1
    
    public static void main(String[]args) {
        stars (7);
        triangle(9);
        odds(9);
        eo(6);
        pyramid(5);
    }

}
