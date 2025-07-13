/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int *ptr=(int*)malloc(numsSize*sizeof(int));
    ptr[0]=nums[0];
    for(int i=1;i<numsSize;i++){
        ptr[i]=nums[i];
        ptr[i]+=ptr[i-1];
    }
    *returnSize=numsSize;
    return ptr;
}