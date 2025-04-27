import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println("Done");
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean exists = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                if (!list1.contains(nums1[i])) {
                    list1.add(nums1[i]);
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            boolean exists = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                if (!list2.contains(nums2[i])) {
                    list2.add(nums2[i]);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        System.out.println(result);
        return result;
    }



}


