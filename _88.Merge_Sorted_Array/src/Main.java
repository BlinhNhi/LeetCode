public class Main {
    public static  void  merge(int[] n1, int m, int[] n2, int n) {
        for(int ai : n2){
            chenPhanTuVaoMang(ai,n1,m);
            m++;
        }
    }
    //x=ai,a=n1
    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m ; k++) {
            // phần tử của mảng n1 > phần tử n2
            if(a[k] > x){
                timDuocK = true;
                // nếu số phần tử i trong arr1 > ptu i trong arr2
                for(int i = m-1 ; i >= k ; i--){
                    // dịch phần tử > hơn sang phải
                    a[i+1] = a[i];
                }
                // gán phần tử của arr2(x) vào vị trí của arr1
                a[k] = x;
                break;
            }
        }
        if(timDuocK == false){
            a[m] = x;
        }
    }

    public static void main(String[] args) {
        int[] n1={2,3,4,5,0,0,0};
        int[] n2={0,3,6};
        merge(n1,4,n2,3);
        System.out.println("DONE");
    }
}