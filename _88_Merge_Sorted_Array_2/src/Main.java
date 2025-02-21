public class Main {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) - 1;
        while (k >= 0){
            if(j < 0){
                // j < 0 (length arr of nums2 < 0 ) thì lấy value của mảng nums1
                n1[k] = n1[i];
                i--;
            }else if(i < 0){
                // i < 0 (length arr of nums1 < 0 ) thì lấy value của mảng nums2
                n1[k] = n2[j];
                j--;
            } else if (n1[i] > n2[j]) {
                // value của mảng 1 > mảng 2 thì lấy value mảng 1
                n1[k] = n1[i];
                i--;
            }else {
                // value của mảng 2 > mảng 1 thì lấy value mảng 2
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] n1={1,2,3,0,0,0};
        int[] n2 ={4,5,6};

        merge(n1,3,n2,3);
        System.out.println("Done");
    }
}