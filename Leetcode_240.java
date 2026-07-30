class Leetcode_240{
    static boolean searchin2d(int matrix[][],int target){
    int row=0;int col=matrix[0].length-1;
    if(matrix==null||matrix[0].length<1||matrix.length<1){
        return false;
    }
    while(col>=0 &&row<=matrix.length){
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col]>target){
            col--;
        }else{
            row++;
        }
    }
return false;
    }
    public static void main(String args[]){
    boolean result = searchin2d(new int[][]{{1,2,3},{4,5,6},{7,8,9}},8);
    System.out.println(result);
    }
}