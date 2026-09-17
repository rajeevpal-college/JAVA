class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
            if(i!=j&&nums[i]==nums[j]&&(Math.abs(i-j)<=k)){
            //((i-j<=k)||(j-i<=k))){   //((i-j<=k)&&(j-i>=k))){
                return true;}
                //j--;
            
        }
        }
        return false;
        
        
    }
}