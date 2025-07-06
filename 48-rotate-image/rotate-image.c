void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    int i,j,temp;
    //transpose of a matrix//
    for(i=0;i<matrixSize;i++){
        for(j=i+1;j<matrixSize;j++){
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    //reversing the rows//
    for(i=0;i<matrixSize;i++){
        int start=0;
        int end=matrixSize-1;
        while(start<end){
            temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;
            end--;
        }
    }
    //printing the rotated matrix//
    for(i=0;i<matrixSize;i++){
        for(j=i+1;j<matrixSize;j++){
            printf("%d , %d",matrix[i][j]);
        }
        printf("/n");
    }
    
}