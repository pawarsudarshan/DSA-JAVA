package Searching;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int n = arr.length;
        boolean flag = false;

        // code for linear search
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("The target element is found");
        else System.out.println("The target element is not found");
    }
}