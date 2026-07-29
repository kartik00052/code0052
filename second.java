public class second {
    static int concatinationKtimes(int n,int k){
    StringBuilder s=new StringBuilder();
    for(int i=0;i<k;i++){
        s.append(n);
    }
    String str=s.toString();
    int sum=0;
    for(int i=0;i<str.length();i++){
        sum+=str.charAt(i)-'0';
    }
    return sum;
    }
    
    public static void main(String[] args) {
    int ans=concatinationKtimes(12,3); 
    System.out.println(ans);
    }
}
