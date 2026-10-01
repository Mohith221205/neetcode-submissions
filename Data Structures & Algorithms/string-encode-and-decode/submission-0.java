class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(String s:strs){
            res+=s.length()+"#"+s;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String>res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
int len = Integer.parseInt(str.substring(i, j));            i=j+1;
            String st = str.substring(i, i + len);
            res.add(st);
            i=i+len;
        }
        return res;
    }
}
