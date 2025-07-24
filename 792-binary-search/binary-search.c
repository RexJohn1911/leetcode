int search(int* nums, int numsSize, int target) {
    int l=0,mid,r=numsSize-1;
    while(l<=r){
        mid=(l+r)/2;
        if(nums[mid]==target)return mid;
        if(target>nums[mid]){
            l = mid+1;
        }
        if(target<nums[mid]){
            r = mid-1;
        }
    }
    return -1;
}