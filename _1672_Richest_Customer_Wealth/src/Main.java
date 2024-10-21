public class Main {
    public static int maximumWealth(int[][] a) {
        // i là khách hàng , j là ngân hàng
    int soKhachHang = a.length;
    int soNganHang = a[0].length;
    int[] tongTaiSan = new int[soKhachHang];
        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            tongTaiSan[i] = tinhTongHangI;
        }
        int max=0;
        for (int i = 0; i < soKhachHang; i++) {
            System.out.println("Tong Tai San KH " + i + ":" + tongTaiSan[i]);
            if (tongTaiSan[i] > max){
                max = tongTaiSan[i];
            }
        }
        System.out.println("Tai San Lon Nhat : " +max);
        return max;
    }
    public static void main(String[] args) {
//        int [][] a ={{1,2,3},{3,2,1}};
        int [][] b ={{1,2,3},{3,2,4},{1,5,2}};

        maximumWealth(b);

//        maximumWealth(a);
//        int[][]b = new int[2][3];
//        int soHang = a.length; // 2 hàng
//        int soCot = a[0].length; // 3 cột
//
//        for (int i = 0; i < soHang; i++) {
//            for (int j = 0; j < soCot; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }

        //        System.out.println("Số Hàng : " + soHang);
        //        System.out.println("Số Cột : " + soCot);
    }
}