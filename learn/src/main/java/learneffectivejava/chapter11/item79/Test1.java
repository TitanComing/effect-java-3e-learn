package learneffectivejava.chapter11.item79;

import java.util.HashSet;

/**
 * Create by peng on 2020/9/23.
 */
public class Test1 {
    public static void main(String[] args) {
        ObservableSet<Integer> set =
                new ObservableSet<>(new HashSet<>());

        set.addObserver((s, e) -> System.out.println(e));

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
