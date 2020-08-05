package learneffectivejava.chapter2.item8;

/**
 * Created by peng on 2020/8/5.
 */
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}
