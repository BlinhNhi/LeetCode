import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
//    Merge Sort (Sắp xếp trộn).
    public int[] merge(int[] a1, int[] a2){
        //        Trộn vào: a1 và a2 là các mảng coi như đã được sắp xếp.Sau khi băm nhỏ ra.
        int n = a1.length + a2.length;
        int[] result = new int[n]; // tạo ra mảng mới có số phần tử(length) bằng a1+a2.
//        Nhét a1 và a2 đã sắp xếp vào mảng result
//        i là chỉ số của mảng result, i1 là index vào mảng a1, i2 là index của mảng a2.
        int i = 0; int i1= 0; int i2 = 0;
        while (i < n){ // i < n phần tử
            if(i1 < a1.length && i2 < a2.length){ //a1 và a2 != rỗng
                if(a1[i1] <= a2[i2]){ // so sánh để tìm phần tử nhỏ nhất của mảng 1 1
                    result[i] = a1[i1]; // nhét nhỏ nhất vào mảng bên trái.(a1 nhỏ hơn)
                    i++; i1++;
                }else{ // a2 nhỏ hơn.
                    result[i] = a2[i2]; // nhét nhỏ nhất vào mảng bên trái.(a1 nhỏ hơn)
                    i++; i2++;
                }
            }else { // a1 rỗng hoặc a2 rỗng
                if(i1 < a1.length){ // a1 ko rỗng
                    result[i] = a1[i1];
                    i++; i1++;
                }else{ // a2 ko rỗng
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }
    public int[] mergeSort(int[] arr,int L,int R){
//        Bài toán cơ sở THĐB || ĐKD.
        if(L > R) return new int[0];
        if(L == R){
            // Dừng việc chia khi L = R(mảng đã bị chia nhỏ thành 1 mảng có 1 phần tử).
            int[] singleElement = {arr[L]};
            return singleElement;
        }
        System.out.println("Chia vị trí index: "+ L + " và "+ R); //   THTQ || Chia ra
        int mid = (L+R)/2;
//        Chia nữa đầu từ left - mid
        int[] a1 = mergeSort(arr,L,mid);
//        Chia nữa cuối từ mid - right
        int[] a2 = mergeSort(arr,mid+1 ,R);
        int[] result = merge(a1,a2);
        System.out.println("Kết quả merge: " + Arrays.toString(result));
        return  result;
    }
    public int[] sortArray(int[] arr){
        return mergeSort(arr,0, arr.length -1);
    }
    public static void main(String[] args) {
        Main s = new Main();
//        int[] a ={1,3,5,7,9};
//        int[] b = {2,4,6,8,10};
        int[] c = {1,5,3,2,8,7,6,4};
//        System.out.println(Arrays.toString(s.merge(a,b)));
        System.out.println(Arrays.toString(s.mergeSort(c,0,c.length-1)));

    }
}