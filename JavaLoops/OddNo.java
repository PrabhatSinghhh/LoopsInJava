package JavaLoops;

import java.util.Scanner;

public class OddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int n= sc.nextInt();
        for( int i = 1; i<=n; i+=2 )
            System.out.println(i);
    }
}
