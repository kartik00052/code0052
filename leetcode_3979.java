public class leetcode_3979 {
    public static int maxvalidpair(int[] nums,int k){
        int n=nums.length;int p=0;int r=0;
        for(int i=0;i<n-k;i++){
        p=Math.max(p,nums[i]);
        r=Math.max(r,p+nums[i+k]);
        }
        return r;
    }
    public static void main(String[] args) {
    int[] nums={1,3,5,2,8};int k=2;
    System.out.println(maxvalidpair(nums,k));
    }
}
