public class Main {
    public static  void  merge(int[] n1, int m, int[] n2, int n) {
        for(int ai : n2){
            chenPhanTuVaoMang(ai,n1,m);
            m++;
        }
    }
    //x=ai = arr2 , a=n1 = arr1
    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timDuocK = false;
        // for all element in arr[]1
        for (int k = 0; k < m ; k++) {
            // phần tử của mảng n1 > phần tử n2(2 > 0)
            if(a[k] > x){
                timDuocK = true;
                // nếu số phần tử i trong arr1 > ptu i trong arr2,
                // m-1 vi dich i la so final xuong k chen len trc dc(4 chen len mat 5)
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
        int[] n1={4,1,3,5,0,0,0};
        int[] n2={4,0,6};
        merge(n1,4,n2,3);
        System.out.println("DONE");
    }
}