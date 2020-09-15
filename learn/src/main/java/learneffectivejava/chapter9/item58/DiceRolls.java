package learneffectivejava.chapter9.item58;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Create by peng on 2020/9/15.
 */
public class DiceRolls {
    enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }

    public static void main(String[] args){
        // Same bug, different symptom!
        Collection<Face> faces = EnumSet.allOf(Face.class);

        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println(i.next() + " " + j.next());

        System.out.println("***************************");

        for (Face f1 : faces)
            for (Face f2 : faces)
                System.out.println(f1 + " " + f2);

    }
}
