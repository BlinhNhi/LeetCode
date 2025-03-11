public class Main {
    public static int Fibonanci(int n) {
        System.out.println("Tính F : [" + n + "]");
//        Công thức nếu n > 2 : F(n) = F(n-1) + F(n-2)=> F(4) = F(3) + F(2) => 2 + 1 = 3.
        if (n <= 2) {
            return 1;
        }
        int Fn = Fibonanci(n - 1) + Fibonanci(n - 2);
        return Fn;
    }

//    Dùng đệ qui có nhớ.
    static  int [] F = new int[1000];
    public static  int Fibonanci2(int n){
//        Công thức nếu n > 2 : F(n) = F(n-1) + F(n-2)=> F(4) = F(3) + F(2) => 2 + 1 = 3.
        if(F[n] !=0) return F[n];
        System.out.println("Can tinh F["+n+"]");
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibonanci2(n-1) + Fibonanci2(n-2);
        return F[n];
    }

    // Ko dùng đệ quy
    public static  int Fibonanci3(int n){
//        Công thức nếu n > 2 : F(n) = F(n-1) + F(n-2)=> F(4) = F(3) + F(2) => 2 + 1 = 3.
        int[] Fibo = new int[11];
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
       return  Fibo[n];
    }
    public static  void printElement(int[] arr,int index){
//        Đi với hàm này printElement sẽ đc gọi trước và chưa in ra phần tử index
//        Do printElement đc gọi ròi + dồn lên trước khi in ra nên khi in ra sẽ có index
//        cuối cùng trước. Khác hàm chạy đệ quy trên in ra rồi mới gọi lại.
        if(index < 0 || index >= arr.length) return;
        printElement(arr, index + 1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6,7};
//        printElement(arr,0);
//        System.out.println(Fibonanci(5));
//        System.out.println(Fibonanci2(5));
        System.out.println(Fibonanci3(10));

    }
}