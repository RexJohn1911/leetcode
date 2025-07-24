int heightChecker(int* heights, int heightsSize) {
    int ans=0,i,j,temp;
    int *arr=(int*)malloc(heightsSize*sizeof(int));
    for(i=0;i<heightsSize;i++){
        arr[i]=heights[i];
    }
    for(i=0;i<heightsSize-1;i++){
        for(j=i+1;j<heightsSize;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(i=0;i<heightsSize;i++){
        if(arr[i]!=heights[i]){
            ans=ans+1;
        }
    }
    return ans;
    
}