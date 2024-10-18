public class Main {
    public static int removeElement(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] !=x){
                a[k] = a[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
            int[] a ={1,2,3,4,5};
            System.out.println(removeElement(a,2));
            System.out.println("Done !!!");
    }
}