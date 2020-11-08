package sort;

/**
 * Created by ZengLR on 2020/11/5.
 */
public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={5,1,8,2,7,4,99,55,1099,2,71,600,10086,9002,11};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static  int[] bubbleSort(int a[]){
        if (a==null||a.length<=1){
            return a;
        }
        int temp;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
