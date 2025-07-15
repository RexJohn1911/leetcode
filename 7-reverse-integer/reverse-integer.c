int reverse(int x){
    int flag,rev=0;
    if(x>0){
        flag=true;
    }
    else if(x<0){
        flag=false;
    }
    abs(x);
    while(x!=0){
        int digit=x % 10;
        if(rev>INT_MAX/10 || (rev == INT_MAX/10 && digit>7))return 0;
        if(rev<INT_MIN/10 || (rev == INT_MIN/10 && digit<-8))return 0;
        rev=(rev*10)+digit;
        x=x/10;
    }
    if(flag=false){
        return -1*rev;
    }
    else if(flag=true){
        return rev;
    }

}