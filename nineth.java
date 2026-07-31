import java.util.*;
public class nineth {
    static int findrank(int[] arr){
    int count=0;
    for(int i=0;i<arr.length;i++){

    for(int j=0;j<arr.length;j++){
        if(arr[i]<arr[j]&&j!=i){
            count++;
        }
        System.out.println(count);
    }
}  
return count;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(findrank(arr));
}
}
