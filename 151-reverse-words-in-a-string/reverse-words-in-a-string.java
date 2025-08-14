class Solution {
    public String reverseWords(String s) {
        String[] rev=s.trim().split("\\s+");
        int start=0;
        int end=rev.length-1;
        while(start<end){
            String temp=rev[start];
            rev[start]=rev[end];
            rev[end]=temp;
            start++;
            end--;
        }
        return String.join(" ",rev);
    }
}