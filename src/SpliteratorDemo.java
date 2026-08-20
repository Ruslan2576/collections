import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    static void main() {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("Содержимое vals:");
        Spliterator<Double> spltitr = vals.spliterator();


        while (spltitr.tryAdvance(System.out::println));
        System.out.println();

        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
//        while (spltitr.tryAdvance(n -> sqrs.add(Math.sqrt(n))));
        spltitr.forEachRemaining(n -> sqrs.add(Math.sqrt(n)));

        System.out.println("Содержимое sqrs:");
        spltitr = sqrs.spliterator();

        spltitr.forEachRemaining(System.out::println);
        System.out.println();
    }
}
