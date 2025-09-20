class Solution {
    public int countNegatives(int[][] grid) {
        int rowlen=grid.length;
        int collen=grid[0].length;
        int row=0,col=collen-1,count=0;
        while(row<rowlen && col>=0){
            if(grid[row][col]<0){
                col--;
                count+=rowlen-row;
                
            }
            else{
                row++;
            }
        }
        return count;
    }
}