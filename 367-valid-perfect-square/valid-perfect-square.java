class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        for(long i=1;i<num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}