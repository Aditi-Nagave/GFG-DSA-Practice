class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int zero_idx = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                zero_idx = i;
                break;
            }
        }
        
        if(zero_idx == -1){
            return;
        }
        for(int i = zero_idx+1 ; i<arr.length ; i++){
            if(arr[i] != 0){
                swap(arr,i,zero_idx);
                zero_idx++;
            }
            
        }
    }
    
    static void swap(int [] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}