package JavaLoops;

import java.util.Scanner;

public class APwithoutFormula {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number of term ");
        int n = sc.nextInt();
        //an= 4,7,10,13,16
        //an = a+(n-1)d
        //an= 3n+1 (arithmetic formula of given exp
        // d = (2nd expression - 1st expression)
        int a = 4;
        for(int i =1;i<=n; i++)
            System.out.println(a);
        a+=3;


    }
}
