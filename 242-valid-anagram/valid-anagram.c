bool isAnagram(char* s, char* t) {
    int count1[26]={0};
    int count2[26]={0};
    int len1=strlen(s);
    int len2=strlen(t);
    if(len1 != len2)return false;
    int i=0;
    while(s[i] && t[i]){
        count1[s[i] -'a']++;
        count2[t[i] -'a']++;
        i++;
    }
    for(i=0;i<26;i++){
        if(count1[i]!=count2[i])return false;
    }
    return true;
}