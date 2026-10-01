class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m=new HashMap<>();
        if(s.length() !=t.length() )
            return false;
        int n=s.length();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(!m.containsKey(t.charAt(i))){
                return false;
            }
            m.put(t.charAt(i), m.get(t.charAt(i)) - 1);
            if (m.get(t.charAt(i)) == 0) {
                m.remove(t.charAt(i));
            }       
            j++;
        }
        if(m.isEmpty() && j==n)
            return true;
        return false;
    }
}
