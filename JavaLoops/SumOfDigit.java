package JavaLoops;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no digit");
        int n= sc.nextInt();

        int sum= 0;
        while(n!=0){
            int ld = n%10;
            sum += ld;
            n/=10;
            System.out.println(sum);


        }
    }
}
