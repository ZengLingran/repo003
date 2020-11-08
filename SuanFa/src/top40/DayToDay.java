package top40;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算某年、某月、某日和某年、某月、某日之间的天数间隔。要求年、月、日通过键盘输入传递到程序中
 */
public class DayToDay {
    public static void main(String[] args) throws ParseException {
        // 传输格式yyyyMMdd
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个日期");
        String s_date1 = sc.next();
        System.out.println("请输入第二个日期");
        String s_date2 = sc.next();
        // 转换成毫秒值运算
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date d1 = sdf.parse(s_date1);
        Date d2 = sdf.parse(s_date2);
        long time = Math.abs(d2.getTime() - d1.getTime());// 要绝对值
        System.out.println("间隔天数：" + (time / 1000 / 60 / 60 / 24));
    }
}
