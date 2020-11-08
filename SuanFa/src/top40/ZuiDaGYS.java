package top40;

import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class ZuiDaGYS {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("请输入第二个数");
        int n=sc.nextInt();
        System.out.print("最大公约数为："+GetGYS(m,n));
    }
    public static int GetGYS(int num1,int num2){
        // 先获得绝对值，保证负数也可以求
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // 假定第一个数较大；如果第二个较大，在第二轮会颠倒过来
        // 如果第二个数为 0，则第一个数就是最大公约数
        while (num2 != 0) {
            // 求余
            int remainder = num1 % num2;
            // 交换数，等同递归调用
            num1 = num2;
            num2 = remainder;
        }

        return num1;
    }
}
