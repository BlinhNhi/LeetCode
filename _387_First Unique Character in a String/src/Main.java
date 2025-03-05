public class Main {
//  tìm ký tự đầu tiên ko bị lặp lại trả về index nếu k có trả -1. Từ a - z : 97 - 122
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray(); //[l, o, v, e, l, e, e, d, c, o, d, e] // rải đoạn string ra từ ptu
        int[] count = new int[123]; // tạo biến cout có 123 phần tử
        // for này để tăng count của mỗi i lên
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i]; //arr[0] = l = 108
            int index = (int)c; // 108
            count[index]++; // 108 có count là 1
        }
//        for này để kiểm tra xem ele nào có count = 1 đầu tiên sẽ trả về vị trí đó
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i]; //arr[0] = l = 108
            int index = (int)c; // 108
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        String c = "lovecode";
//        char[] arr = c.toCharArray();
//        System.out.println(arr.length);
        System.out.println(firstUniqChar("loveleedcode"));
        firstUniqChar("loveleedcode");
    }
}