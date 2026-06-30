class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
       
    }
    private static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static int[] reverse(int [] arr , int start , int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
}