public class Main {

    public  static  int binarySearch(int[] a, int key,int left, int right){
       if(left > right) return -1;
       int mid = (left + right) /2;
       if(a[mid] == key){
           return mid;
       } else if (key > a[mid]) {
           return binarySearch(a,key,mid+1,right);
       }else {
           return binarySearch(a,key,left,mid-1);
       }
    }
    public  static  int binarySearch(int[] a, int key){
        int n = a.length;
        return binarySearch(a,key,0,n-1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(binarySearch(a,4));
    }
}