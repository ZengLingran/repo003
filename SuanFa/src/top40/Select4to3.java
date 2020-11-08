package top40;

/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Select4to3 {
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    //相互都不相等
                    if(i!=j&&i!=k&&j!=k){
                        num+=1;
                        System.out.println(100*i+10*j+k);
                    }
                }
            }
        }
        System.out.print("共有"+num+"个排列");

    }
}
