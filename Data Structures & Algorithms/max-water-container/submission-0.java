class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int n=heights.length;
        int j=n-1;
        int ans=0;
        int area=0;
        while(i<j){
            int k=Math.min(heights[i],heights[j]);
            area=k*(j-i);
            ans=Math.max(ans,area);
            if(heights[i]<heights[j]){
                i++;

            }
            else
                j--;
        }
        return ans;
    }
}
