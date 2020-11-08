package top40;

import java.util.Scanner;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class MoveArr {
    public static void main(String[] args) {
        int N =10;
        int[] a = new int[N];
        Scanner s = new Scanner(System.in);
        System.out.println("请输入10个整数：");
        for(int i=0; i<N; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("你输入的数组为：");
        for(int i=0; i<N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n请输入向后移动的位数：");
        int m = s.nextInt();
        //定义一个中间数组
        int[] b = new int[m];
        //1.先把后m个数复制到中间数组中
        for(int i=0; i<m; i++) {
            b[i] = a[N-m+i];
        }
        //2.从后往前依次后移
        for(int i=N-1; i>=m; i--) {
            a[i] = a[i-m];
        }
        //把中间数组中的变量复制到前m个位置
        for(int i=0; i<m; i++) {
            a[i] = b[i];
        }
        System.out.print("位移后的数组是：");
        for(int i=0; i<N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
