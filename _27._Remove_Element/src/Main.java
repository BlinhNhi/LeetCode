public class Main {
    public static void main(String[] args) {
        int[] n1={3,2,2,3};
        removeElement(n1,3);
        System.out.println("Done");
    }

    public  static int  removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i=0; i < n ; ){
            if(nums[i] == val){
                for(int j = i; j < n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
}