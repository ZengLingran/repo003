package top40;

/**
 1

 1 1

 1 2 1

 1 3 3 1

 1 4 6 4 1

 1 5 10 10 5 1
 */
public class YangHuiSanJiao {
    public static void main(String[] args) {
        int i,j;
        int a[][];
        a=new int[8][8];
        for(i=0;i<8;i++){
            a[i][i]=1;
            a[i][0]=1;
        }
        for(i=2;i<8;i++){
            for(j=1;j<=i-1;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(i=0;i<8;i++){
            for(j=0;j<i;j++){
                System.out.printf("  "+a[i][j]);
            }
            System.out.println();
        }

    }
}
