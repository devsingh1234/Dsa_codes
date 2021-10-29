import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr2 = {5,10,15,20,25,60,3,8,2,66,7};
        int[] ans = mergeTwoSortedArray(arr2,arr2.length-1,0);

        System.out.println(arr2.length);
        for (int val: ans) {
            System.out.print(val + " | ");
        }
        System.out.println();
        System.out.println(ans.length);
   }

    public static int[] mergeSort(int arr[] , int arr2[]){
        int[] merged = new int[arr.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr.length && j<arr2.length) {
            if (arr[i] > arr2[j]) {
                merged[k] = arr2[j];
                k++;
                j++;
            }
            else  {
                merged[k] = arr[i];
                k++;
                i++;
            }
        }


            while (j < arr2.length) {
                merged[k] = arr2[j];
                k++;
                j++;

        }
                while (i<arr.length){
                    merged[k] = arr[i];
                    k++;
                    i++;
            }


        
return merged;
    }
    public static int[] mergeTwoSortedArray(int a[],int up , int lo ){
        System.out.println(Arrays.toString(a)+" "+up+" "+lo);
        if(lo==up){
            int[] br = new int[1];
            br[0] = a[lo];
            return br;
        }

        int mid = (up+lo)/2;
        int[] first = mergeTwoSortedArray(a,mid,lo);
        int[] second = mergeTwoSortedArray(a,up,mid+1);
        int[] merge = mergeSort(first,second);
        return merge;
    }
}
