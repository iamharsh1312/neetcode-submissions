class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []ans = new int[nums.length];
        int n=nums.length;
        int zero_count=0;
        int prod=1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }
            else{
                zero_count++;
            }
        }
        if(zero_count>1){
            return new int[n];
        }

        for(int i=0;i<n;i++){
            if(zero_count>0){
                ans[i]=(nums[i]==0) ? prod:0;
            }
            else{
                ans[i]=prod/nums[i];
            }
        }
        return ans;
        
    }
}  
