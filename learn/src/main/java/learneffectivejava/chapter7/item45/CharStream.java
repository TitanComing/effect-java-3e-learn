package learneffectivejava.chapter7.item45;

/**
 * Create by peng on 2020/9/7.
 */
public class CharStream {
    public static void main(String[] args){
        "Hello world".chars().forEach(System.out::print);
        System.out.println();

        "Hello world!".chars().forEach(x -> System.out.print((char) x));
        System.out.println();

    }
}
