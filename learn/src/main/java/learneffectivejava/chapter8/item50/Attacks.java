package learneffectivejava.chapter8.item50;


import java.util.Date;

/**
 * Created by peng on 2020/9/7.
 */
public class Attacks {
    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);  // Modifies internals of p!
        System.out.println(p);

        // Second attack on the internals of a Period instance  (Page 233)
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);  // Modifies internals of p!
        System.out.println(p);
    }
}
