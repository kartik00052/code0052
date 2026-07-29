public class third {
static boolean isPrime(int n){
    if(n<2){
        return true;
    }
    for(int i=0;i<n;i++){
    if(n%i==0){
        return false;
    }
    }
    return true;
}
static int digitsum(int n){
    int sum=0;
    sum+=n%10;
    int temp=n;
    n/=10;
    return temp;
}
static int mainfunc(int A,int B){
return 0;
}
public static void main(String[] args) {
    
}
}
