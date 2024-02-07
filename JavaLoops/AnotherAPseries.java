package JavaLoops;

import java.util.Scanner;

public class AnotherAPseries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the the no of terms");
        int n = sc.nextInt();
        //an= 4,7,10,13,16
        //an = a+(n-1)d
        //an= 3n+1 (arithmetic formula of given exp
        // d = (2nd expression - 1st expression)
        for(int i=4; i<=3*n+1; i+=3)
            System.out.println(i);
    }
}
