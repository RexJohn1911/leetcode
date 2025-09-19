class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        for(char arr:stones.toCharArray()){
            if(set.contains(arr)){
                count++;
            }
        }
        return count;
    }
}