class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st = new HashSet<>();
        int n=s.length();
        int ans=0;
        int i=0,j=0;
        while(j<n){
            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(s.charAt(j));
            ans=Math.max(ans, st.size());
            j++;
        }       
        return ans;
    }
}
