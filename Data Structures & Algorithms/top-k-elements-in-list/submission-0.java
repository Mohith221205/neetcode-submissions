class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int nu:m.keySet()){
            pq.add(nu);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}
