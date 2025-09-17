class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bW=new HashSet<>();
        for(String bw: bannedWords){
            bW.add(bw);
        }
        int count=0;
        for(int i=0;i<message.length;i++){
            if(bW.contains(message[i])){
                count++;
            }
            if(count==2)return true;
        }
        return false;
    }
}