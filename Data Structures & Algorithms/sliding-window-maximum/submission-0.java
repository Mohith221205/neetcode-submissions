class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int i=0;
        int j=0;
        int index=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(j<n){
            pq.add(nums[j]);
            if(j-i+1==k){
                res[index]=pq.peek();
                index++;
                pq.remove(nums[i]);
                i++;
            }
            j++;
        }
        return res;
    }
}
