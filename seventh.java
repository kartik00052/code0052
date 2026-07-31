import java.util.*;
public class seventh {
public static List<Integer> primeseries(int n){
ArrayList<Integer> arr=new ArrayList<>();
int m=1;
for(int i=n;i>=0;i--){
if(i==1) {
    break;
    
}
if(i>1 && n%i==0){
arr.add(i);
arr.add(i+1);
arr.add(i*(i+1));

}
}
return arr;
    }
    public static void main(String[] args) {
        System.out.println(primeseries(10));
    }
}
