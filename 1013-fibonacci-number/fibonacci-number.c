

int fib(int n){
    if(n<=1){
        return n;
    }
    else if(n>1){
        return fib(n-1)+fib(n-2);
        
    }
    else if(0<=n<=30){
        return 0;
    }

}