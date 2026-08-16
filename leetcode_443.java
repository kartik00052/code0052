public class leetcode_443 {
    public static int compress(char[] chars){
        int n=chars.length;int i=0;//read pointer 
        int index=0;//write pointer
        while(i<n){
            char cur=chars[i];
            int count=0;
            while(i<n&&chars[i]==cur){
                i++;count++;

            }
            chars[index++]=cur;
            if(count>1){
            String countstr=Integer.toString(count);
            for(char ch:countstr.toCharArray()){
                chars[index++]=ch;
            }   
            }
        }
        return index;
    }
    public static void main(String[] args){
        char[] chars={'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newlength=compress(chars);
        System.out.println("Compressed Array Length"+newlength);
        System.out.print("Compressed Array");
        for (int i = 0; i < newlength; i++) {
            System.out.print(chars[i] + " ");
        }

    }
}
