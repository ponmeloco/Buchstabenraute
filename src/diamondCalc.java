public class diamondCalc {
    private static void printLetter(int numberOfLetter, int row) {
        int start = 65;
        for (int i = 1 + row; i <= numberOfLetter; i++) {
            System.out.print(".");
            if (i == numberOfLetter) {
                System.out.print((char) (start + row));
                if(row >0) {
                    System.out.print(".");
                    for(int dotsBetween = 1; dotsBetween< row; dotsBetween++) {
                        System.out.print("..");
                    }
                    System.out.print((char) (start + row));
                }
                for (int dotsAfterLetters = 1; dotsAfterLetters <= numberOfLetter- row; dotsAfterLetters++) {
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }

    static void print1(int numberOfLetter){
        for (int Row = 0; Row <= numberOfLetter; Row++) {
            printLetter(numberOfLetter, Row);
        }
    }

    static void print2(int numberOfLetter){
        for (int Row = numberOfLetter-2; Row >= 0; Row--) {
            printLetter(numberOfLetter, Row);
        }
    }
}
