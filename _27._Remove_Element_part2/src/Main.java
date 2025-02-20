public class Main {
    public static void main(String[] args) {
        int[] a ={3,2,2,3};
        System.out.println(removeElement(a,2));
        System.out.println("DONE");
    }

    public static int removeElement(int[] a, int val) {
        int inValid = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != val){
                a[inValid] = a[i];
                inValid++;
            }
        }
        return  inValid;
    }
}