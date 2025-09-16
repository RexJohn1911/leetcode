class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        int ans;
        while(n>0){
            ans=n%10;
            sum+=ans;
            pro*=ans;
            n=n/10;
        }
        return pro-sum;
    }
}