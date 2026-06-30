class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;

        int[] nums = new int [d];

        for(int i = 0 ; i< d ; i++){
            nums[i] = arr[i];
        }
        
        for(int i = d ; i<n ; i++){
            arr[i-d] = arr[i];
        }
        int idx =0;
        
        for(int i = n-d ; i<n ; i++){
            arr[i] = nums[idx];
            idx++;
        }
    }
}