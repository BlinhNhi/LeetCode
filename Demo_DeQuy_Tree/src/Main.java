public class Main {
    public static  int Fibonanci(int n){
        System.out.println("Tính F : ["+n+"]");

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