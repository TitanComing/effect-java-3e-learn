package learneffectivejava.chapter7.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by peng on 2020/9/7.
 */
public class Freq {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File(args[0]);
        Map<String, Long> freq;
        try(Stream<String> words = new Scanner(file).tokens()){
            freq = words.collect(groupingBy(String::toLowerCase, counting()));
        }

        System.out.println(freq);

        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(topTen);
    }
}
