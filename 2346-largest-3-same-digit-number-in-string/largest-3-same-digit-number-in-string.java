class Solution {
    public String largestGoodInteger(String num) {
        for(char a='9';a>='0';a--){
            String ans=String.valueOf(a).repeat(3);
            if(num.contains(ans)){
                return ans;
            }
        }
        return "";
    }
}