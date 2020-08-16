package learneffectivejava.chapter5.item31;

import java.util.Arrays;
import java.util.List;

/**
 * Created by peng on 2020/8/16.
 */
public class Swap {
    public static void swap(List<?> list, int i, int j){
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j){
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        // Swap the first and last argument and print the resulting list
        List<String> argList = Arrays.asList(args);
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);
    }
}