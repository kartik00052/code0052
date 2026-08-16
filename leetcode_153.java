public class leetcode_153{
public static int findMin(int[] nums){
int n=nums.length-1;int l=0;int r=n;int last=nums[n];
while(l<r){
    int mid=(l+r)>>1;
    if(nums[mid]>last){
        l=mid+1;
    }else{
        r=mid;
    }

}
return nums[l];
    }
    public static void main(String args[]){
        int[] nums={3,4,5,0,1,2};
        int result=findMin(nums);
        System.out.println(result);
    }
}