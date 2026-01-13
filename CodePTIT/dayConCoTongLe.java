import java.util.*;

public class dayConCoTongLe {
    public static int n, k;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static ArrayList<Integer> indexes = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> s = new ArrayList<>();

    public static void inkq() {
        int tong = 0;
        for (int idx : indexes) tong += arr.get(idx);
        if (tong % 2 != 0) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int idx : indexes) temp.add(arr.get(idx));
            s.add(temp);
        }
    }

    public static void Try(int i, int start) {
        for (int j = start; j < n; j++) {
            indexes.add(j);
            if (i == (k - 1)) inkq();
            else Try(i + 1, j + 1);
            indexes.remove(indexes.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            arr.clear();
            indexes.clear();
            s.clear();

            for (int i = 0; i < n; i++) arr.add(sc.nextInt());
            Collections.sort(arr, Collections.reverseOrder());

            for (int K = 1; K <= n; K++) {
                k = K;
                Try(0, 0);
            }

            // sort theo từ điển số học
            Collections.sort(s, new Comparator<ArrayList<Integer>>() {
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    int len = Math.min(o1.size(), o2.size());
                    for (int i = 0; i < len; i++) {
                        if (!o1.get(i).equals(o2.get(i))) {
                            return o1.get(i) - o2.get(i);
                        }
                    }
                    return o1.size() - o2.size();
                }
            });

            for (ArrayList<Integer> subseq : s) {
                for (int x : subseq) System.out.print(x + " ");
                System.out.println();
            }
        }
    }
}
