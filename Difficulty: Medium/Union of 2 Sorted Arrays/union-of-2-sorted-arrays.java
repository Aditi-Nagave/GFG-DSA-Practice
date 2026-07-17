class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for(int i = 0 ; i<a.length ; i++){
            treeSet.add(a[i]);
        }
        for(int i = 0 ; i<b.length ; i++){
            treeSet.add(b[i]);
        }
        
        return new ArrayList<>(treeSet);
    }
}
