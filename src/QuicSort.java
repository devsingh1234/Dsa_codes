public class QuicSort {
    public static void main(String[] args) {
        int[] arr = {20,10,30,50,60,5,80,25};
        QuickSorting(arr,arr.length-1,0);
        for (int val: arr) {
            System.out.print(val + " | ");

        }
    }
    public static void QuickSorting(int[] a, int high , int low){
        if(low>=high){
            return;
        }

        //partitioning
        int mid = (low+high)/2;
        int pivot = a[mid];

        int left = low;
        int right = high;
        while(left<=right){
            while (a[left]<pivot){
                left++;
            }
            while (a[right]>pivot){
                right--;
            }
            if (left<=right){
                int temp = a[left];
                a[left] = a[right];
                a[right]=temp;
                left++;
                right--;
            }

        }
        QuickSorting(a,right,low);
        QuickSorting(a,high,left);

    }
}
