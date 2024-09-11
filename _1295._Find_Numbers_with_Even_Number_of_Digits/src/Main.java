public class Main {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums){
            // ktra so chu so cua a . Neu chu so la chan => tang bien dem len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0){
                count ++;
            }
        }
        return  count;
    }
    private static int tinhSoChuSo(int a) {
        //2 Đếm số chữ số , 9 -> 1 , 29 -> 2
        int count = 0;
        int kq = a;
        while (kq !=0){
            kq = a/10;
            a = kq;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,22,3,4};
        //for i cần kiểm tra chỉ số index , for each k cần.
//        for(int ai : nums ){
//            System.out.println("Count ai : " + ai);
//        }

        System.out.println(findNumbers(nums));
//        System.out.println(findNumbers(99));


    }
}