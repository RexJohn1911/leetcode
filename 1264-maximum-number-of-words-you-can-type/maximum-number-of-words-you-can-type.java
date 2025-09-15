class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> ab=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()) ab.add(ch);
        int count=0;
        for(String x:text.split(" ")){
            boolean ok=true;
            for(char ch:x.toCharArray()){
                if(ab.contains(ch)){
                    ok=false;
                    break;
                }
            }
            if(ok)count++;
        }
        return count;
    }
}