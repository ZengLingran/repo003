package top40;

/**
 * Created by ZengLR on 2020/11/6.
 */
public class BallDown {
    public static void main(String[] args) {
        double h = 100; // 反弹的高度
        double sum = 0; // 总长

        for (int i = 0; i < 10; i++) {
            sum = sum + h + h / 2;
            h = h / 2;
        }
        sum = sum - h; // 减去第十次反弹的高度
        System.out.println("第十次反弹高度是" + h + "米");
        System.out.println("一共经过" + sum + "米");

    }
}
