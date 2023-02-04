import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsIterator {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);

        set.forEach(System.out::println);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
