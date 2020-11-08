package top40;

import java.util.Scanner;

/**
 * 将一个正整数分解质因数,例如:输入 100 : 打印 100 = 2 * 2 * 5 * 5
 */
public class FenJieZhiYinShu {
    //n代表需要输入的正整数
    static int n,k = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        System.out.print(n+"="); // 进行前半部分的打印

        // 做出判断循环
        for(int k=2;k<=n;k++) {
            while(n!=k) {
                if(n%k==0) {
                    System.out.print(k+"*");
                    n=n/k;
                }else{
                    break;
                }
            }
        }
        System.out.println(n); // 表示打印出的是最後一个数
    }
}
