package learneffectivejava.chapter12.item89.enumsingleton;

import java.util.Arrays;

/**
 * Create by peng on 2020/9/22.
 */
public enum Elvis {
    INSTANCE;
    private String[] favoriteSongs =  { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}