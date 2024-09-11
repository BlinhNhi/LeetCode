public class HowToDebug {
    public static  void F(int a){
        a++;
        System.out.println("Check a "  + a);
    }
    public static void main(String[] args) {
        int a = 0;
        int n =2;
        int[] arr = {1,2,33};
        a++;
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println("a = " + a);
            F(a);
        }
        System.out.println("DONE!");
    }
}