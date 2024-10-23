public class Main {
    public static boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        String r1 = ""; // plus all arr1 in string
        String r2 = "";
        // duyệt các phần tử trong arr1 + dồn lại.
        for(String s : arr1){
            r1 += s;
        }
        for(String s : arr2){
            r2 += s;
        }
        return r1.equals(r2);
    }
    public static void main(String[] args) {
        String [] arr1 = {"ab","c"};
        String [] arr2 = {"ab","c"};
        System.out.println(arrayStringsAreEqual(arr1,arr2));
    }
}