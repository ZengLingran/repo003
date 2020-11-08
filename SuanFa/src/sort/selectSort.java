package sort;

public class selectSort {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        int a[]={5,1,8,2,7,4,99};
        selectSort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    //选择排序
    public static int[] selectSort(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if (a[min]>a[j]){
                    min=j;
                }
            }
            //交换
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
}
