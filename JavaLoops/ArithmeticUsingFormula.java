package JavaLoops;

import java.util.Scanner;

public class ArithmeticUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n term");
        int n = sc.nextInt();
        //1,3,5,7,9
        //an = a+(n-1)d
        //an= 2n-1 (arithmetic formula of given exp
        // d = (2nd expression - 1st expression)

        for(int i = 1; i<=2*n-1; i+=2)
            System.out.println(i);
    }
}
