class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String str: sentences){
            String[] arr=str.split(" ");
            count=Math.max(arr.length,count); 
        }
        return count;
    }
}