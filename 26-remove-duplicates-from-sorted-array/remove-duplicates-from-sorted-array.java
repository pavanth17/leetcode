class Solution {
    public int removeDuplicates(int[] n) {
        if(n.length==0) return 0;
        int i=0;
        for(int j=1;j<n.length;j++){
            if(n[i]!=n[j]){
                i++;
                n[i]=n[j];
            }
        }
        return i+1;
    }
}