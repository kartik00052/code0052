public class sixth {
    public static int Tribonacci(int n){
        if(n==0) return 1;
    if(n==1||n==2) return 1;
    int a=0;int b=1;int c=1;
    int d=a+b+c;
    for(int i=3;i<=n;i++){
       d=a+b+c;
        a=b;b=c;c=d;

    }
    return d;    
    }
    public static void main(String args[]){
        System.out.println(Tribonacci(7));

    }
}
