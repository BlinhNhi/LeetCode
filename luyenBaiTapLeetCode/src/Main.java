public class Main {
    public static  void  merge(int[] n1, int m, int[] n2, int n) {
        for(int ai : n2){
            chenPhanTuVaoMang(ai,n1,m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int ai, int[] n1, int m) {
        for (int i = 0; i < m; i++) {
            if(n1[i] > ai ){
                for (int j = m-1; j >= i; j--) {
                    n1[j + 1] = n1[j];
                }
                n1[i] = ai;
            }
            else{
                n1[m] = ai;
            }
        }
    }


    public static void main(String[] args) {
        int[] n1={1,2,3,0,0,0};
        int[] n2={2,5,6};
        merge(n1,3,n2,3);
        System.out.println("DONE");
    }

}

