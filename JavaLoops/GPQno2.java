package JavaLoops;

import java.util.Scanner;

public class GPQno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no term");
        int n = sc.nextInt();
        //given gp = 3,12,48.....
        int a = 3;
        for(int i = 3; i<=n; i++){
            System.out.println(a);
            a*=4;
        }
    }
}
