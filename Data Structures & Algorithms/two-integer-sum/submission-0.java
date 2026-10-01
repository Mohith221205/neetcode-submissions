class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=target-nums[i];
            if(s.containsKey(t))
                return new int[]{s.get(t),i};
            s.put(nums[i],s.getOrDefault(nums[i],i));
        }
        return new int[]{-1,-1};
    }
}
