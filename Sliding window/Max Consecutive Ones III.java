class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0;
        int left=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
