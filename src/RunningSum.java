class RunningSum {
    public int[] runningSum(int[] nums) {
        if(nums.length < 1 && nums.length > 1000) {
            return nums;
        } else {
            int[] runningSums = new int[nums.length];
            int n=0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] < -1000000 || nums[i] > 1000000) {
                    return nums;
                }
                n = nums[i] + n;
                runningSums[i] = n;
            }
            return runningSums;
        }
    }
}