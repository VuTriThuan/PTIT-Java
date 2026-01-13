import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class MapCoBan {
    public static void main(String[] args) {
        //HashMap: không có thứ tự, tìm kiếm O(1)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3, 5);
        map.put(1, 2);
        map.put(3, 4);
        map.put(2, 4);
        // hàm size(), containsKey(), contains.Value(x), clear(), isEmpty(), remove()
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //LinkedHashMap: sắp xếp theo thứ tự được thêm vào, tìm kiếm O(1)

        //TreeMap: sắp xếp theo thứ tự tăng dần, tìm kiếm O(logN):
    }
}
