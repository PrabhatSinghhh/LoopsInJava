package JavaLoops;

import java.util.Scanner;

public class CountNoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of digit");
        int n= sc.nextInt();

        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
