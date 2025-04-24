public class Main {
    public static void main(String[] args) {
        int[] nums={3,1,0,0,2,4};
        moveZeroes(nums);
        System.out.println("Done");
    }

    public static void moveZeroes(int[] nums) {
//        Part3 | 2ms
       int pos = 0;
       for(int i= 0; i < nums.length; i++){
           if(nums[i] != 0){
               nums[pos] = nums[i];
               pos++;
           }
       }
       for(int j = pos; j < nums.length; j++){
           nums[pos] = 0;
           pos++;
       }
    }
}

// Part1
//int n = nums.length;
//        for(int i= 0; i < n;){
//        if(nums[i] == 0 ){
//        for(int j = i; j < n - 1; j++){
//nums[j] = nums[j+1];
//        }
//nums[n-1] = 0;
//n--;
//        }
//        else{
//i++;
//        }
//        }

// Part 2 | 1ms
//int pos = 0;
//       for(int i= 0; i < nums.length; i++){
//        if(nums[i] != 0){
//nums[pos] = nums[i];
//pos++;
//        }
//        }
//        while(pos < nums.length){
//nums[pos] = 0;
//pos++;
//        }