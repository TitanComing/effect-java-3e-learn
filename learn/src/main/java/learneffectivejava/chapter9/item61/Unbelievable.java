package learneffectivejava.chapter9.item61;

/**
 * Create by peng on 2020/9/15.
 */
// What does this program do? - Page 274
public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
        // i是个Integer类型，比较的时候自动发生了开箱操作，然后i没有初始化，就报了空指针。
       if (i == 42)
            System.out.println("Unbelievable");
    }
}
