class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int nu:s){
            if(!s.contains(nu-1)){
                int cur=nu;
                int curl=1;
                while(s.contains(cur+1)){
                    curl++;
                    cur++;
                }
                maxlength=Math.max(maxlength,curl);
            }
        }
        return maxlength;
    }
}
