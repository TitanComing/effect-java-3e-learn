package learneffectivejava.chapter6.item36;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Create by peng on 2020/8/18.
 */
public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles){
        System.out.printf("Applying styles %s to text%n",
                Objects.requireNonNull(styles));
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }

}
