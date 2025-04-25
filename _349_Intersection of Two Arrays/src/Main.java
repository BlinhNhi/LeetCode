public class Main {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4};
        int[] nums2={3,4,5,6};
        intersection(nums1,nums2);
        System.out.println("Done");
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        int count = 0;
            for(int i= 0; i < nums1.length; i++){
                for (int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j]){
                        boolean isExists = false;
                        for (int k = 0; k < count; k++) {
                            if(temp[k] == nums1[i]){
                                isExists = true;
                                break;
                            }
                        }
                        if (!isExists){
                            temp[count] = nums1[i];
                            count++;
                        }
                        break;
                    }
                }
            }
            int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}