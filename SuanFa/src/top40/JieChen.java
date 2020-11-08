package top40;

import java.util.Scanner;

/**
 * 利用递归方法求5!
 */
public class JieChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=recursion(n);
        System.out.print(m);
    }

    public static long recursion(int n){
        long value = 0 ;
        if(n ==1 || n == 0) {
            value = 1;
        } else if(n > 1) {
            value = n * recursion(n-1);
        }
        return value;
    }
}
