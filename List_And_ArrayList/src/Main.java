import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>();
       // intern add là thêm ptử vào.
       arr.add(1);
       // xoá ptử theo index
       arr.remove(12);
       // xoá toàn bộ
       arr.clear();
       // ktra list có chứa phần tử bên trong
       arr.contains(1);
    }
}