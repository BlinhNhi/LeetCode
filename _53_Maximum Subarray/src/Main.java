public class Main {
    public static void main(String[] args) {
//        int[] nums={5,4,-1,7,8};
//        int[] nums={-1,-2};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(nums);
        System.out.println("Done");
    }

    public static int maxSubArray(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }
}