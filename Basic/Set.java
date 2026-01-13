import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        //HashSet: không có thứ tự, tìm kiếm O(1)
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(1);
        // hàm size(), contains(), clear(), isEmpty(), remove()
        for (int x : set){
            System.out.print(x + " ");
        }

        //LinkedHashSet: sắp xếp theo thứ tự được thêm vào, tìm kiếm O(1)

        //TreeSet: sắp xếp theo thứ tự tăng dần, tìm kiếm O(logN):
            // floor(x) trả về phần tử lớn nhất <= x hoặc null nếu không tồn tại
            // ceilling(x) trả về phần tử nhỏ nhất >= x hoặc null nếu không tồn tại
            // first(), last() trả về phần tử đầu, cuối trong set
            // lower(x) trả về phần tử lớn nhất nhỏ hơn x hoặc null nếu không tồn tại
            // higher(x) trả về phần tử nhỏ nhất lớn hơn x hoặc null nếu không tồn tại
    }
}
