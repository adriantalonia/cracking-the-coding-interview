package geeksforgeeks._01_binarysearch;

public class BinarySearch {

    public static int binarysearch(int arr[], int n, int k) {
        int init = 0;
        int last = n-1;



        return search(arr, k, init, last);
    }

    public static int search(int arr[], int x, int init, int last) {

        if(init > last) {
            return -1;
        }else {
            int mid = (init+last)/2;
            if(x == arr[mid]) return mid;
            else if(x > arr[mid]) return search(arr, x, mid+1,last);
            else return search(arr,x,init, mid-1);
        }
    }
}
