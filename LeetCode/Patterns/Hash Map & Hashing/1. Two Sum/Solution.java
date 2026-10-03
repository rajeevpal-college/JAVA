class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int []arrayr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if( (nums[j]+nums[i])==target&&i!=j) {
                   arrayr[0]=i;
                   arrayr[1]=j;}
                   }
                //retur 
               //return i ,j;
               
            }
        
        return arrayr;
        
    }
}