class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        int n=s.length();
        
        int i=0;
        HashMap<Character, Integer>mp = new HashMap<>();
        int maxf=0;
        for(int j=0;j<n;j++){
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j),0)+1);
            maxf = Math.max(maxf, mp.get(s.charAt(j)));
            
            while((j-i+1)-maxf>k){
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            res = Math.max((j-i+1),res);
          
        }
        
        return res;
    }
}
