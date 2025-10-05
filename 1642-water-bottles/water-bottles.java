class Solution {
    public int numWaterBottles(int n, int ex) {
        int ans=n+(n-1)/(ex-1);
        return ans;
    }
}