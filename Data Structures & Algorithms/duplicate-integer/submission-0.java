class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            for(int k=i+1;k<nums.length;k++){
                if(j==nums[k]){
                    return true;
                }
            }

       }
       return false; 
    }
}
