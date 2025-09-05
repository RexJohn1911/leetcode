class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        if(n<4)return 0;
        Arrays.sort(nums);
        return ( (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]) );
    }
}