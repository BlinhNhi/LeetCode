public class Main {

    public static void main(String[] args) {
        int[] nums={3,2,2,3,1,2,4};
        twoSum(nums,7);
        System.out.println("Done");
    }
    public static int[] twoSum(int[] nums, int target) {
       for(int i= 0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
       }
       return new int[] {};
    }


}