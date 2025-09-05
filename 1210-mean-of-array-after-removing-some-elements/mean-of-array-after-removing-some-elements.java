class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum=0;
        int a=(int)(arr.length * 0.05);
        for(int i=a;i<arr.length-a;i++){
            sum+=arr[i];
        }
        return sum/(arr.length-(a*2));
    }
}