package learneffectivejava.chapter11.item81;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Create by peng on 2020/9/25.
 */
public class Intern {
    // Concurrent canonicalizing map atop ConcurrentMap - not optimal
    private static final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    //    public static String intern(String s) {
//        String previousValue = map.putIfAbsent(s, s);
//        return previousValue == null ? s : previousValue;
//    }

    // Concurrent canonicalizing map atop ConcurrentMap - faster!
    public static String intern(String s){
        String result = map.get(s);
        if(result == null){
            result = map.putIfAbsent(s, s);
            if(result == null)
                result = s;
        }
        return result;
    }
}
