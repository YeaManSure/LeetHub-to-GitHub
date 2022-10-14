class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int counter = 1;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = counter; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (target == sum) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
            counter++;
        }
        return output;
    }
}