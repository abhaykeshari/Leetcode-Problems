class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0 ; i < nums.length; i++){ //01234
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach , i +nums[i]);//2 4 4 48
        }
        return true;
    }
}