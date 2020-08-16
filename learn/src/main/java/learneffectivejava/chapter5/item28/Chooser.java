package learneffectivejava.chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by peng on 2020/8/16.
 */
public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args){
        List<Integer> intList = List.of(1,2,3,4,5,6);

        Chooser<Integer> chooser = new Chooser<>(intList);

        for (int i = 0; i < 10; i++){
            Number choice = chooser.choose();
            System.out.println(choice);
        }

    }

}
