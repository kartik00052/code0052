import java.util.*;
public class leetcode_3 {
    public int repeatedSubstring(String s){
    Map<Character,Integer> mp=new HashMap<>();
        int l=0;int max=0;
    for(int r=0;r<s.length();r++){
char c=s.charAt(r);
if(mp.containsKey(c) && mp.get(c)>=l){
    l=mp.get(c)+1;
}
mp.put(c,r);
}
return max;
    }
    public static void main(String[] args){
    leetcode_3 obj=new leetcode_3();
    String s="abcabcbb";
    int result=obj.repeatedSubstring(s);
    System.out.println(result);
    }
}
