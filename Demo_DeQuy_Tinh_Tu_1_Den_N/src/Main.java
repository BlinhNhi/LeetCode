public class Main {
    public static int TimN  (int n){
        System.out.println("Tim n : ["+n+"]");
        if(n<=0){return 0;}
        return  n + TimN(n-1);
    }
    public static int SoMu(int a,int n){
        System.out.println("Tim n : ["+n+"]");
        if(n <= 0){
            return 1;
        }
        return a * SoMu(a,n-1) ;
    }
    public static void main(String[] args) {
//        System.out.println(TimN(6));
        System.out.println("Số Mũ là : " + SoMu(2,3));

    }
}