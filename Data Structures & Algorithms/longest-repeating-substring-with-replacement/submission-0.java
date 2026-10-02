class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> m=new HashMap<>();
        int i=0;
        int max=0;
        int res=0;
        for(int j=0;j<s.length();j++){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            max=Math.max(max,m.get(s.charAt(j)));
             while ((j - i + 1) - max > k) {
                char left = s.charAt(i);

                m.put(left, m.get(left) - 1);

                i++;
            }
                        res = Math.max(res, j - i + 1);


        }
        return res;
    }
}
