import java.util.Scanner;

public class mainDiamond {
    public static void main(String[] args) {
        System.out.println("Enter letter ♥");
        Scanner sc = new Scanner(System.in);
        char x = sc.next().toUpperCase().charAt(0);
        int cc = x - 64;
        diamondCalc.print1(cc);
        diamondCalc.print2(cc);
    }
}



