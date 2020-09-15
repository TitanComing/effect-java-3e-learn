package learneffectivejava.chapter9.item59;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Create by peng on 2020/9/15.
 */
public class RandomBug {
    static Random rnd = new Random();

//    static int random(int n){
//        return Math.abs(rnd.nextInt()) % n;
//    }
    static int random(int n){
        return ThreadLocalRandom.current().nextInt(n);
    }

    public static void main(String[] args){
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for(int i = 0; i < 1000000; i++){
            if(random(n) < n/2)
                low++;
        }
        System.out.println(low);
    }
}
