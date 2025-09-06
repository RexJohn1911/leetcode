class Solution {
    public int getSum(int a, int b) {
        int ans=0;
        if(a>=0 && b>=0){
            for(int i=0;i<a;i++)ans++;
            for(int j=0;j<b;j++)ans++;
            
        }
        if(a>=0 && b<0){
            for(int i=0;i<a;i++)ans++;
            for(int j=0;j>b;j--)ans--;
            
        }
        if(a<0 && b>=0){
            for(int j=0;j<b;j++)ans++;
            for(int i=0;i>a;i--)ans--;
            
        }
        if(a<0 && b<0){
            for(int i=0;i>a;i--)ans--;
            for(int j=0;j>b;j--)ans--;
        }
        return ans;
    }
}