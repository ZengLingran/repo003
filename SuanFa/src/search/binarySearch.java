package search;

/**
 * Created by ZengLR on 2020/11/6.
 */
public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,3,8,9,22,77,99,101,10086,92000,180000};
        int k=101;
        System.out.print(binarySearch(arr,k));
    }

    public static int binarySearch(int a[],int key){
        int low,mid,high;
        //设置最小和最大下标
        low=0;
        high=a.length-1;
        while (low<=high){
            mid=(high+low)/2;
            if (key>a[mid]){
                low=mid+1;
            }else if (key<a[mid]){
                high=mid-1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
