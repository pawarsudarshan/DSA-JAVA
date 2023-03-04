package Sorting;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // code for selection sort
        for(int idx=0;idx<n;idx++){
            int min = arr[idx];
            int minIndex = idx;
            for(int j=idx;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int val:arr) System.out.print(val+" ");
    }
}
