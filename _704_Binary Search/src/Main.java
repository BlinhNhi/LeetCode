public class Main {
//    Sử dụng vòng lặp.
    public  static  int binarySearch(int[] a,int key){
        int n = a.length;
        int iLeft = 0;
        int iRight = n-1;
        while (iLeft <= iRight){
//            chia đôi mảng để tìm
            int iMid = (iLeft + iRight)/ 2;
            System.out.println("[" + iLeft + "," + iRight + "] xet: " + iMid);
            if(key == a[iMid]){
//            nếu trong mảng chia đôi ở vị trí hiện tại có key trả về vị trí index.
                return  iMid;
            } else if (key > a[iMid]) {
//                nếu giá trị bên trái > giá trị của mảng giữa thì lấy giá trị bên
//                trái tăng dần để thu hẹp độ dài mảng.
                iLeft = iMid +1;
            }else {
//                nếu giá trị bên phải > giá trị của mảng giữa thì lấy giá trị bên
//                phải giảm dần để thu hẹp độ dài mảng.
                iRight = iMid -1;
            }
        }
        return -1;
    }

    public  static  int binarySearchRecursion(int[] a,int key, int iLeft, int iRight){
        if(iLeft > iRight) return -1;
        System.out.println("[" + iLeft + "," + iRight + "]");
        int iMid = (iLeft+iRight) /2;
        if(key == a[iMid]){
            return iMid;
        } else if (key > a[iMid]) {
            return  binarySearchRecursion(a,key,iMid+ 1,iRight);
        }else {
            return  binarySearchRecursion(a,key,iLeft,iMid - 1);
        }
    }
    public  static  int binarySearchRecursion(int[] a,int key){
        int n = a.length;
        return  binarySearchRecursion(a,key,0,n-1);
    }

//    Sử dụng đệ quy.
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,72,13,14,15};
        int[] arr1 = {1,4,9,12,19,25,31,46,50,57,72};
        System.out.println(binarySearchRecursion(arr,72));

//        System.out.println(binarySearch(arr,72));
//        System.out.println(binarySearch(arr1,31));
    }
}