package learneffectivejava.chapter3.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by peng on 2020/8/11.
 */
public class WordList {
    public static void main(String[] args){
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
