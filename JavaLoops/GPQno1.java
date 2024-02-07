package JavaLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GPQno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of terms");
        int n= sc.nextInt();
        //given gp = 1,2,4,8,16,32
        int a = 1;      // a= first term
        for(int i= 1; i<=n; i++) {
            System.out.println(a);
            a *= 2;
        }
    }
}
