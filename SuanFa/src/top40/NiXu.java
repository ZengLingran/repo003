package top40;

import java.util.Scanner;

/**
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class NiXu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = input.nextInt();
        function(num);
    }
    public static void function(int num) {
        int len = 0;
        int [] strArry = new int[5];
        int i=0;
        while(num%10!=0) {
            len++;
            strArry[i++]=num%10;
            num = num/10;
        }
        System.out.println(len);
        for(int j=0;j<len;j++) {
            System.out.print(strArry[j]);
        }
    }
}
