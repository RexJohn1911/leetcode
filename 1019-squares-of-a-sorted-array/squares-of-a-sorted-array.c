/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
*returnSize=numsSize;
int *ptr=(int*)malloc(numsSize*(sizeof(int)));
int i,j,temp;
for(i=0;i<numsSize;i++){
    ptr[i]=nums[i]*nums[i];
    ptr[j]=nums[j]*nums[j];
}
for(i=0;i<numsSize-1;i++){
    for(j=i+1;j<numsSize;j++){
        if(ptr[i]>ptr[j]){
            temp=ptr[i];
            ptr[i]=ptr[j];
            ptr[j]=temp;
        }
    }
}
return ptr;
}