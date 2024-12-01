public class Main {
    public static void main(String[] args) {
        int[] a ={3,2,2,3};
        System.out.println(removeElement(a,2));
        System.out.println("DONE");
    }
    public static int removeElement(int[] a, int val) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != val){
                a[n] = a[i];
                n++;
            }
        }
        return n;
    }
}


//int n  = a.length;
//        for (int i = 0; i < n;) {
//        if(a[i] == val){
//        for (int j = i; j < (n-1); j++) {
//a[j] = a[j+1];
//        }
//n--;
//        }else {
//i++;
//        }
//        }
//        return  n;