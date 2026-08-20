import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    static void main() {
        // Без сохранения порядка вставки
        HashSet<String> hs = new HashSet<>();

        // С сохранением порядка вставки
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");

        System.out.println(hs);
        System.out.println(lhs);
    }
}
