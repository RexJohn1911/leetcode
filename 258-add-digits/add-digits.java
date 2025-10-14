class Solution {
    public int addDigits(int num) {
        int ans=0;
        while(num>=10){
            ans=0;
            while(num>0){
                int a=num%10;
                ans+=a;
                num=num/10;
            }
            num=ans;
        }
        return num;
    }
}