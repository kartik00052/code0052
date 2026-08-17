public class leetcode_1047{
    public String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int n=sb.length();
            if(sb.length()>0 && sb.charAt(n-1)==ch){
                sb.deleteCharAt(n-1);
            }else{
                sb.append(ch);
            }
        }
return sb.toString();
    }
    public static void main(String[] args){
        leetcode_1047 obj=new leetcode_1047();
        String s="abbaca";
        System.out.println(obj.removeDuplicates(s));
    }
}