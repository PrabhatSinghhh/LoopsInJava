package JavaLoops;

import java.util.Scanner;

public class CheckCompositeOrPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the number ");
        int n = sc.nextInt();

        int x = 0; //prime number
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                System.out.println("composite no");
                x = 1;
                break;
            }
        }

                if (n == 1) System.out.println("neither prime nor composite");
                else if (x == 0) System.out.println("prime no");


            }

        }

