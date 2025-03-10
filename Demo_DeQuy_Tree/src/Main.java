public class Main {
    public static  int Fibonanci(int n){
        System.out.println("Tính F : ["+n+"]");
//        Công thức nếu n > 2 : F(n) = F(n-1) + F(n-2)=> F(4) = F(3) + F(2) => 2 + 1 = 3.
        if(n <= 2){
            return 1;
        }
        int Fn = Fibonanci(n-1) + Fibonanci(n-2);
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
    public static void main(String[] args) {
        System.out.println(Fibonanci(5));
//        System.out.println(Fibonanci2(5));
    }
}