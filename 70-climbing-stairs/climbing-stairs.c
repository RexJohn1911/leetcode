int climbStairs(int n) {
    if(n==0 || n==1){
        return 1;
    }
    int a=1,b=1,temp,i;
    for(i=2;i<=n;i++){
        temp=a+b;
        a=b;
        b=temp;
    }
    return b;
    if(n<0){
        return 0;
    }
    else if(n>45){
        return 0;
    }
    
}