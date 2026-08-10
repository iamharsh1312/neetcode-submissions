class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String,List<String>>p = new HashMap<>();
        // for(String s:strs){
        // char charArray[] = s.toCharArray();
        // Arrays.sort(charArray);
        // String sortedres = new String(charArray);
        // p.putIfAbsent(sortedres,new ArrayList<>());
        // p.get(sortedres).add(s);
        // }
        // return new ArrayList<>(p.values());
        Map<String,List<String>>ans = new HashMap<>();
        for(String s:strs){
            int [] cnt = new int[26];
            for(char c:s.toCharArray()){
                cnt[c-'a']++;
            }
            String key = Arrays.toString(cnt);
            ans.putIfAbsent(key,new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
