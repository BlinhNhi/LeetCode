public class Main {
    public static void main(String[] args) {
        int[] nums={1,0,3,2,4,5};
        runningSum(nums);
        System.out.println("Done");
    }
    public static int[] runningSum(int[] nums) {
        for(int i= 1 ; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}