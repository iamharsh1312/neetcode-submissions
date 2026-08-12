class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        // int res=0;
        // Stack<Integer>st = new Stack<>();
        // for(int i=0;i<n;i++){
        //     while(!st.isEmpty() && height[i]>=height[st.peek()]){
        //         int mid = height[st.pop()];
        //         if(!st.isEmpty()){
        //             int r=height[i];
        //             int l = height[st.peek()];
        //             int h = Math.min(l,r)-mid;
        //             int w = i-st.peek()-1;
        //             res+=h*w;

        //         }
        //     }
            
        //     st.push(i);
            
        // }
        // return res;
        int l=0, r=n-1;
        int lm=height[l], rm=height[r];
        int ans=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm = Math.max(lm,height[l]);
            ans+=lm-height[l];
            }
            else{
                r--;
                rm = Math.max(rm,height[r]);
               ans+=rm-height[r];

            }
        }
    return ans;
        
    }
}
