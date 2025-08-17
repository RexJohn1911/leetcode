class Solution {
    public int removeDuplicates(int[] nums) {
        int a=nums.length;
        int b=0;
        for(int i=0;i<a;i++){
            if(nums[i]!=nums[b]){
                b++;
                nums[b]=nums[i];
            }
        }
        return b+1;
    }
}