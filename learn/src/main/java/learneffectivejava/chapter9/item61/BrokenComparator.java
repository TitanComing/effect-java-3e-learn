package learneffectivejava.chapter9.item61;

import java.util.Comparator;

/**
 * Create by peng on 2020/9/15.
 */
public class BrokenComparator {
    public static void main(String[] args){
        // 对装箱类型运用==操作符会出错
//                Comparator<Integer> naturalOrder =
//                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

//         Fixed Comparator - Page 274
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // Auto-unboxing
            return i < j ? -1 : (i == j ? 0 : 1);
        };

        int result = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result);
    }
}
