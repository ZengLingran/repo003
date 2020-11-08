package top40;

import java.util.Scanner;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Circle {
    public static void main(String[] args) {
        t1();
    }

    public static void t1() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入游戏人数: ");
        int n = s.nextInt();
        int pNum = n;    //存在的人数
        int index = 0;    //数组下标
        int countNum = 0;    //计数器
        int[] ary = new int[n];
        while (pNum > 1) {       //当剩下最后一个人循环结束
            if (ary[index] == 0) {
                countNum++;
                if (countNum == 3) {    //每3次重置一次计数器
                    countNum = 0;
                    ary[index] = 1;
                    pNum--;     //每计算到3就退出1位玩家
                }
            }
            index++;
            if (index == n) {        //每次对数组循环结束把下标重置
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (ary[i] == 0) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }
}
