class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> m=new HashMap<>();
        for(char c:t.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        String res;
        int i=0;
        int j=0;
        int formed=0;
        int required=m.size();
        int start=0;
        int minlength=Integer.MAX_VALUE;
        while(j<s.length()){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            if(m.containsKey(c)&&map.get(c).equals(m.get(c)))
            formed++;
            j++;
            while(formed==required){
                if(j-i < minlength){
                    minlength=j-i;
                    start=i;
                }
                char remove=s.charAt(i);
                map.put(remove,map.get(remove)-1);
                if(m.containsKey(remove) && map.get(remove)<m.get(remove)){
                    formed--;
                }
                i++;
            }
        }
            if(minlength==Integer.MAX_VALUE)
                return "";
        
        return s.substring(start,start+minlength);
    }

}

