package Sorting;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // code for insertion sort
        // example - sorting of playing cards in hand
        // move elements to make room for new coming element
        for(int i=0;i<n;i++){
            int j;
            int curr = arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>=curr)
                arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = curr;
        }

        for(int val:arr) System.out.print(val+" ");
    }
}
