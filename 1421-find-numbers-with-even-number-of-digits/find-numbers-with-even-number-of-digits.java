class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ans=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                ans++;
            }
            if(ans%2 == 0){
                count+=1;
            }
        }
        return count;
    }
}