class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int count=0;
        int res=0;
        Set<Character> set=new HashSet<>();
        for(int j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
                res=Math.max(res,j-i+1);
            
        }
        return res;
    }
}
