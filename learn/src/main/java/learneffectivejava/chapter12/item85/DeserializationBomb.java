package learneffectivejava.chapter12.item85;

import java.util.HashSet;
import java.util.Set;

import static learneffectivejava.chapter12.Util.deserialize;
import static learneffectivejava.chapter12.Util.serialize;

/**
 * Create by peng on 2020/9/18.
 */

// Deserialization bomb - deserializing this stream takes forever - Page 340
public class DeserializationBomb {
    public static void main(String[] args) throws Exception{
        System.out.println();
        deserialize(bomb());
    }

    static byte[] bomb() {
        Set<Object> root = new HashSet<>();
        Set<Object> s1 = root;
        Set<Object> s2 = new HashSet<>();

        for(int i = 0; i < 100; i++){
            Set<Object> t1 = new HashSet<>();
            Set<Object> t2 = new HashSet<>();
            t1.add("foo");
            s1.add(t1);
            s1.add(t2);
            s2.add(t1);
            s2.add(t2);
            s1 = t1;
            s2 = t2;
        }
        return serialize(root);

    }

}
