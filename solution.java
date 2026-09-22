class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = {0, 0};
        boolean f = true;
        for(int i = 0; i < nums.length; i++) {
            if(!f) break;
            for(int j = i+1; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])) {
                    res[0] = i;
                    res[1] = j;
                    f = false;
                    break;
                }
            }
        }
        return res;
    }
}
