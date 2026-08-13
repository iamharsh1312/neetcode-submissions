class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int s1cnt[] = new int[26];
        int s2cnt[] = new int[26];
        for(int i=0;i<s1.length();i++){
            s1cnt[s1.charAt(i)-'a']++;  
        }
        int n=s1.length();
        int m=s2.length();

        int i=0,j=0;

        while(j<m){

            s2cnt[s2.charAt(j)-'a']++;

            if((j-1+1)>=n){
                 s2cnt[s2.charAt(i)-'a']--;
                 i++;
            }

            if(Arrays.equals(s1cnt,s2cnt)){
                return true;
            }
            j++;
        }
        return false;
     
    }
}
