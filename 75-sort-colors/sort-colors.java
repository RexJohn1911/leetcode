class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int t=nums.length-1;
        int i=0;
        while(i<=t){
            if(nums[i]==0){
                swap(nums,z,i);
                i++;
                z++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,t);
                t--;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}