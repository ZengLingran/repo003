package top40;

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class FZandFM {
    public static void main(String[] args) {
        float fm = 1f;
        float fz = 1f;
        float temp;
        float sum = 0f;
        for (int i=0;i<20;i++){
            temp = fm; //1
            fm = fz;  //1
            fz = fz + temp; //2
            sum += fz/fm; //2
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
