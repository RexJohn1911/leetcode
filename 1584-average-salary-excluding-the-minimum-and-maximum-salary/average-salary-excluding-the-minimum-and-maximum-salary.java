class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        double min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        double sum=0;
        for(double s:salary){
            sum += s;
            min=Math.min(s,min);
            max=Math.max(s,max);
        }
        return (sum - min - max)/(n-2);
    }
}