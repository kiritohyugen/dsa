// Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.

// Examples : 

// Input: arr = {1, 4, 3, -5, -4, 8, 6};
// Output: min = -5, max = 8

// Input: arr = {1, 4, 45, 6, 10, -8};
// Output: min = -8, max = 45

public class MinimumAndMaximumElementsOfArray {

    public static void minAndMAxElementsOfArray(int[] arr,int min,int max){

//        End Case
        if(arr.length<1){
            System.out.println("min = " + min + " , max = " + max);
            return;
        }

        int[] temp = new int[arr.length-1];
        for(int i = 0;i<arr.length-1;i++){
            temp[i] = arr[i+1];
        }
        if(arr[0]<min)
            min = arr[0];

        if(arr[0]>max)
            max = arr[0];

        minAndMAxElementsOfArray(temp,min,max);

    }

    public static int findMinRec(int[] A, int N ){

        if(N == 1){
            return A[0];
        }

        return Math.min(A[N-1],findMinRec(A,N-1));
    }

    public  static void main (String[] args){
//        int[] arr = {1, 4, 3, -5, -4, 8, 6};
//        int min = arr[0];
//        int max = arr[0];
//        minAndMAxElementsOfArray(arr,min,max);

        int[] A = {1, 4, 3, -5, -10, 8, 6};
        int n = A.length;
        // Function calling
        System.out.println(findMinRec(A, n));
    }
    
}
