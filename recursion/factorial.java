package recursion;

import java.util.Scanner;

public class factorial{
    static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args){
        // System.out.println(fact(5));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(fact(a));
        sc.close();
    }
}
