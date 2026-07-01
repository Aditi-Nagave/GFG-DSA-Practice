class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet <Integer> union = new TreeSet<>();
        
        for(int num : a){
            union.add(num);
        }
        for(int num : b){
            union.add(num);
        }
        
        return new ArrayList<>(union);
    }
}
