public class first{
    private static int count(int a,int b){
    int count=0;
    for(int i=a;i<=b;i++){
    if(i%3==0 && sumofdigit(i)%2==0){
        count++;
    }
}
return count;
}
private static int sumofdigit(int c){
    int sum=0;
    while(c>0){
    int l=c%10;
    sum+=l;
    c/=10;
}
return sum;
}
    public static void main(String[] args) {
    int ans=count(10000,200000 );
    System.out.println(ans);
    

    }
}