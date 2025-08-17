class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int[] arr=new int[a+b];
        int c=0;
        for(int i=0;i<a;i++){
            arr[c++]=nums1[i];
        }
        for(int i=0;i<b;i++){
            arr[c++]=nums2[i];
        }
        Arrays.sort(arr);
        int x=arr.length;
        if(x % 2 == 1){
            return (double)arr[x/2];
        }
        return ((double)arr[x/2] +(double) arr[(x/2)-1])/2.00;
    }
}