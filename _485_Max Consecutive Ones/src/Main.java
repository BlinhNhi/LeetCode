public class Main {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,0,1,1,1,1,0,0,0,1};
        findMaxConsecutiveOnes(nums);
        System.out.println("Done");
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i] == 0 ){
                count = 0;
            }else{
                count++;
                if(count > maxCount){
                    maxCount  = count;
                }
            }
        }
        System.out.println(maxCount);
        return  maxCount;
    }
}
