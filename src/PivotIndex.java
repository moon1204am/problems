public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                rightSum = rightSum + nums[j];
            }
            if(leftSum == rightSum) {
                return i;
            } else {
                rightSum = 0;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
