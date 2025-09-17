class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            if(arr[i]!=arr[i+1]){
                count=1;
            }
            if(count>n/4){
                return arr[i];
            }
        }
        return -1;
    }
}