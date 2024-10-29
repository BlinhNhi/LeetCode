//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);

        for(int i = 0; i < a.length; ++i) {
            System.out.printf("%d", a[i]);
        }

        System.out.println();
    }

    public static void insertionSort(int[] a) {
        int n = a.length;

        for(int i = 1; i < n; i++) {
//        Chèn a[i] vào đây 0 -> i-1
            int ai = a[i];
            int j = i-1;
            while(j >=0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            //3,5,2 => 3,2,5 => 2,3,5
            a[j+1] = ai;
            printArray(i, a);
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 2, 7, 4, 6};
        insertionSort(a);
    }
}
