package learneffectivejava.chapter8.item55;

import java.util.*;

/**
 * Created by peng on 2020/9/8.
 */
public class Max {
    public static <E extends Comparable<E>>
    Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);

        System.out.println(max(words));

        // Using an optional to provide a chosen default value (Page 251)
        String lastWordInLexicon = max(words).orElse("No words...");
        System.out.println(lastWordInLexicon);
    }
}
