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
    public static void main(String[] args) {
        System.out.println(Fibonanci(5));
    }
}