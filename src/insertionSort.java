public class insertionSort {
    public static void main(String[] args) {
        int[] aray = {5,4,10,1,6,2};
        InsertionSort(aray);
        printt(aray);

    }

    public static void InsertionSort(int arr[]){
        for (int counter = 1; counter < arr.length; counter++) {
            int temp  = arr[counter];
            int j = counter-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }
    }
    public static void printt(int[] arr){


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(" the number at " + i + " index is");
            System.out.println(arr[i]);
        }


    }
}
