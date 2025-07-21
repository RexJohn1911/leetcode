bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    int original=x,digit;
    long long rev=0;
    while(x!=0){
        digit=x %10;
        rev=(rev*10)+ digit;
        x=x/10;
    }
    return (original==rev);
}