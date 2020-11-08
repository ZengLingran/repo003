package sort;

/**
 * Created by ZengLR on 2020/11/5.
 */
public class quickSort {

    public static void main(String[] args) {
        int arr[]={5,1,8,2,7,4,99,55,1099,2,71,600,10086,9002,11};
        quickSort(arr,0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] quickSort(int[] arr, int left, int right) {
                if (left < right) {
                        //获取中轴元素所处的位置
                        int mid = partition2(arr, left, right);
                        //进行分割
                        arr = quickSort(arr, left, mid - 1);
                        arr = quickSort(arr, mid + 1, right);
                    }
                return arr;
            }

    public static int partition2( int[] arr, int left, int right)
    {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while(true)
        {
            //向右遍历扫描
            while(i <= j && arr[i] <= pivot) i++;
            //向左遍历扫描
            while(i <= j && arr[j] >= pivot) j--;
            if(i >= j)
                break;
            //交换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //把arr[j]和主元交换
        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }

}
