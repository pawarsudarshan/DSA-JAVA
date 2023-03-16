package Searching;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int start = 0, end = n-1;
        boolean flag = false;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index"+mid);
                flag = true;
                break;
            }
            else if(arr[mid]<target) start = mid+1;
            else end = mid-1;
        }
        if(!flag) System.out.println("Element not found");
    }
}
