public class Main {
    public static  void printArray(int no, int[] a){
        System.out.printf("%d: ",no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d",a[i] );
        }
        System.out.println();
    }
    public  static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;

            //sau mỗi vòng lặp xét 2 ptu kề nhau(j , j+1 , đk: j+1 < n)
            // sau mỗi vòng lặp thì -i
            // (tìm ra ptử lớn nất phía cuối chỉ cần chạy đến i-1)
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]){
                    isSorted = false;
                    int t = a[j]; a[j]=a[j+1]; a[j+1]=t;
                }
            }
            printArray(i,a);
            if (isSorted){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []a ={1,3,5,2,7,4,6};
        bubbleSort(a);
    }
}