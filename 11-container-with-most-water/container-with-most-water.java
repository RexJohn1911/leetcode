class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int curr_area=0;
        int max_area=0;
        while(left<right){
            curr_area=(int)(Math.min(height[left],height[right]) * (right-left));
            max_area=Math.max(curr_area,max_area);
            if(height[left]<=height[right]){
                left++;
            }
            else if(height[right]<height[left]){
                right--;
            }
        }
        return max_area;
    }
}