package top40;

import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class LianXuADD {
    public static void main(String[] args) {
        System.out.println("请输入原始的数字");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入要相加的个数");
        int n = scanner.nextInt();
        int num = 0;
        int all = 0;
        int m=0;
        for(int i = 0; i<n; i++) {
            //定义f为10的次方
            int f = (int) Math.pow(10, i);
            m = a*f; //3,30,300....
            num += m; //最后一位的值
            all += num; //所有值
        }
        System.out.print(all);
    }
}
