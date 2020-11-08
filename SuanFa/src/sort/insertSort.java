package sort;

/**
 * Created by ZengLR on 2020/11/5.
 */
public class insertSort {
    public static void main(String[] args) {
        int arr[]={5,1,8,2,7,4,99,55,1099,2,71,600,10086,9002,11};
        insertSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] insertSort(int []a){
        //如果a只有0或者1个数，直接返回
        if(a==null||a.length<2){
            return a;
        }
        //进行插入排序
        int n=a.length;
        //从第1个元素开始抽取元素，默认第0个元素有序
        for (int i=1;i<n;i++){
            int temp=a[i];//temp=1
            //从第i个元素左边第一个开始
            int k=i-1; //k=0
            //直到找到比a[i]小的元素k，即k+1开始都大于等于a[i]
            while (k>=0&&a[k]>temp){
                k--; //k=-1
            }
            //所有比第i个元素大的依次后移
            for (int j=i;j>k+1;j--){
                a[j]=a[j-1];
            }
            //这时第k+1个位置已经移动到，插入这里
            a[k+1]=temp;
        }
        return a;
    }
}
