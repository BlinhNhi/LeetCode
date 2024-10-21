public class Main {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Duyệt từ cuối mảng về đầu
        for (int i = n - 1; i >= 0; i--) {
            // Nếu phần tử không phải là 9, chỉ cần cộng 1 và trả về
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Nếu phần tử là 9, biến nó thành 0
            digits[i] = 0;
        }

        // Nếu tất cả các phần tử đều là 9 (ví dụ: [9,9,9] -> [1,0,0,0])
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        System.out.println(newNumber);
        return newNumber;
    }
    public static void main(String[] args) {
        int [] a ={1,2,3};
        int[] b= {9};
        plusOne(a);
        plusOne(b);
    }
}