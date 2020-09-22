package learneffectivejava.chapter12;

import java.io.*;

/**
 * Create by peng on 2020/9/22.
 */
public class Util {
    public static byte[] serialize(Object o){
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(ba).writeObject(o);
        } catch (IOException e){
            throw new IllegalArgumentException(e);
        }
        return ba.toByteArray();
    }

    public static Object deserialize(byte[] bytes) {
        try {
            return new ObjectInputStream(
                    new ByteArrayInputStream(bytes)
            ).readObject();
        } catch (IOException | ClassNotFoundException e){
            throw new IllegalArgumentException(e);
        }
    }
}
