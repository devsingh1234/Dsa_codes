public class bubbleSortedOptimized {
    public static void main(String[] args) {
        int[] arr = {13,9,15,16,19};
        bubbleSort(arr);
        printt(arr);
    }
    // int this bubble sort we have taken into account
    // that if the array is already sorted to a certain
    // extend then we can use a flag variable
    // if the flag variable is set to one that means
    // swapping has accrued so we will keep on swapping
    // but if the variable is set to 0 than no swapping is done
    // so we will break the loop and come outside
    public static int[] bubbleSort(int a[]){
        int counter =0;
        int n = a.length;
        for (int i = 0; i <n-1 ; i++) {
            int flag =0 ;
            for (int j = 0; j < n-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag =1;

                }
                //this counter is for my own purpose to check
                //how many times my code ran
                //and it came out to be 7 times which is 3 less
                // the normal ideal bubble sort algo
                counter++;

            }

            if (flag==0)
                break;
        }
        System.out.println(counter);
        return a;
    }
    public static void printt(int[] arr){


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(" the number at " + i + " index is");
            System.out.println(arr[i]);
        }


    }
}
