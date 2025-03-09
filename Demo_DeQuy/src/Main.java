public class Main {
    public static  int GiaiThua(int n){
//        Công thức tính giai thừa > 0 là n * !(n-1)
        // Bai Toan Co So
        if(n==0){
            return 1;
        }
        //Cong Thuc Quy Nạp
        int t =n * GiaiThua(n-1);
        return t;
    }
    public static void main(String[] args) {
//        System.out.println(GiaiThua(0));
        System.out.println(GiaiThua(2));
//        System.out.println(GiaiThua(2));
//        System.out.println(GiaiThua(3));
//        System.out.println(GiaiThua(4));
//        System.out.println(GiaiThua(6));

    }
}