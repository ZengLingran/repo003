package top40;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */

public class countStr {
    public static void main(String[] args) {
        int upCaseCnt=0;
        int lowCaseCnt=0;
        int spaceCnt=0;
        int letterCnt=0;
        int numCnt=0;
        int otherCnt=0;
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //字符串转换成字符数组
        char[] ch = str.toCharArray();
        //遍历字符数组
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                upCaseCnt++;
            }else if(Character.isLowerCase(ch[i])) {
                lowCaseCnt++;
            }else if(Character.isDigit(ch[i])){
                numCnt++;
            }else if(Character.isSpaceChar(ch[i])){
                spaceCnt++;
            }else if(Character.isLetter(ch[i])){
                letterCnt++;
            }else{
                otherCnt++;
            }
        }
        System.out.println("大写字母:"+upCaseCnt);
        System.out.println("小写字母:"+lowCaseCnt);
        System.out.println("空格:"+spaceCnt);
        System.out.println("数字:"+numCnt);
        System.out.println("中文:"+letterCnt);
        System.out.println("其他："+otherCnt);


    }

}
