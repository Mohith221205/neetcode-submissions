class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int t=target-numbers[i];
            if(m.containsKey(t)){
                return new int[]{m.get(t)+1,i+1};
            }
            m.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
