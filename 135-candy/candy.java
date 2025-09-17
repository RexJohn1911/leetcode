class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] can=new int[n];
        int ans=0;
        Arrays.fill(can,1);
        //from start to its previous
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                can[i]=(can[i-1]+1);
            }
        }
        //from end to its next
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                can[i]=Math.max(can[i],can[i+1]+1);
            }
        }
        for(int num:can){
            ans+=num;
        }
        return ans;
    }
}