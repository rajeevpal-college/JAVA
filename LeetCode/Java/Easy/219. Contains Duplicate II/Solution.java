class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]&&(i-j==k){
                return true;}
                //j--;
            
        }
        }
        return false;
        
        
    }
}