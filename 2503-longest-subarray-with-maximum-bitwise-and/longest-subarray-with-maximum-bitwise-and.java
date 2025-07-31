class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int count=0,result=0;
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                count++;
                if(count>result){
                    result=count;
                }
            }
            else{
                count=0;
            }
        }
        return result;
    }
}