package top40;

/**
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个
 */
public class MonkeyCut {
    public static void main(String[] args) {
        //关于index,可以从1开始，但是我们知道桃子数一定是要大于5的，所以从6开始
        int index=6;
        while (true){
            //对于每一个index都调用finds()方法来判断其是否符合条件
            boolean finds=finds(index);
            //如果符合条件，终止循环
            if (finds){
                System.out.print("海滩上最少有"+index+"个桃子");
                break;
            }
            index+=5;
        }
    }
    public static boolean finds(int num){
        boolean flag=false;
        //有5只猴子，所以循环5次
        for (int i=1;i<=5;i++){
            //判断num是否大于5，并且除以5余1
            if(num>5&& num%5==1){
                if(i==5){
                    flag=true;
                }else {
                    //桃子数量-1，再乘以原来的五分之四
                    num=(num-1)/5*4;
                }
            }else {
                return false;
            }
        }
        return flag;
    }
}
