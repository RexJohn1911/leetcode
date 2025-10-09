class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int total=nums[l]+nums[h];
            if(total==target){
                return new int[]{l+1,h+1};
            }
            if(total<target){
                l++;
            }
            else{
                h--;
            }
        }
        return new int[]{-1,-1};
    }
}