public class Main {
//    Không trả về kết quả.
//    Điều kiện dừng là i của phần hiện tại.
//    Do hàm trả về void nên phải có 1 bin lưu kq.
    private  static  int curMax = -1;
    public static  void findMax(int[] arr, int i){
            if(i < arr.length){
                if(arr[i] > curMax){
                    curMax = arr[i];
                }
                findMax(arr, i+1);
            }
    }

    public static  int findMax2(int[] arr, int i, int previousMax){
        //  Trả về giá trị lớn nhất tại thời điểm hiện tại( từ 0 -> vị trí thứ i)
        //  nên cần lưu vào biến
        //    max hiện tại là previousMax(là giá trị max ngay phái trước)
        if(i < arr.length){
           int curMax = Math.max(previousMax,arr[i]);
//           Do current max là số đứng trước max nên truyền vào phải gọi lại.
           return  findMax2(arr,i+1,curMax);
        }
        return previousMax; // nếu mảng rỗng trả về giá trị truyền vào đứng trước i.
//        cái hay của hàm trả về giá trị là ta có thể in ra kq bởi vì hàm luôn trả về kq.
    }

//    Có trả về kết quả.
    public static void main(String[] args) {
        int[] arr= {1,2,3,10,5,4};
        curMax = -1;
        findMax(arr,0);
//        System.out.println(curMax);
        System.out.println(findMax2(arr,0,-1));

    }
}