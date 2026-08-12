class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i=0;
        int j=n-1;

        while(i<j)
        {
           while(i<j && !alphanumeric(s.charAt(i))){
            i++;
           }
           while(j>i && !alphanumeric(s.charAt(j))){
            j--;
           }
           if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
            return false;
           }
           i++;
           j--;

        }
        return true;
    }

    public boolean alphanumeric(Character c){
        return ( c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9');
    }
}
