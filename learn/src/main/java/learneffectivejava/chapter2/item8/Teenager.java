package learneffectivejava.chapter2.item8;

/**
 * Created by peng on 2020/8/5.
 */
public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");

        // Uncomment next line and retest behavior, but note that you MUST NOT depend on this behavior!
      System.gc();
    }
}
