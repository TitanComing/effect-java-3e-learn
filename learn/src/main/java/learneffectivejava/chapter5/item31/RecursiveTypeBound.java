package learneffectivejava.chapter5.item31;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by peng on 2020/8/16.
 */
public class RecursiveTypeBound {
    public static <E extends Comparable<? super E>> E max(List<? extends E> list){
        if(list.isEmpty())
            throw new IllegalArgumentException("Empty collection");

        E result = null;
        for(E e: list)
            if(result == null || e.compareTo(result)>0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static void main(String[] args){
        List<String> argList = Arrays.asList(args);
        System.out.println(max(argList));
    }

}
