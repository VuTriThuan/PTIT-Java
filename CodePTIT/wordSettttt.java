import java.util.*;

class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        set = new TreeSet<>();
        for (String x : s.trim().toLowerCase().split("\\s+")) {
            set.add(x);
        }
    }

    public WordSet union(WordSet other) {
        TreeSet<String> res = new TreeSet<>(this.set);
        res.addAll(other.set);
        return new WordSet(res);
    }

    public WordSet intersection(WordSet other) {
        TreeSet<String> res = new TreeSet<>(this.set);
        res.retainAll(other.set);
        return new WordSet(res);
    }

    private WordSet(TreeSet<String> s) {
        this.set = s;
    }

    @Override
    public String toString() {
        return String.join(" ", set);
    }
}

public class wordSettttt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
