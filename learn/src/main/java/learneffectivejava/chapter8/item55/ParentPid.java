package learneffectivejava.chapter8.item55;

import java.util.Optional;

/**
 * Created by peng on 2020/9/8.
 */
public class ParentPid {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();

        // Inappropriate use of isPresent
        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("Parent PID: " + (parentProcess.map(processHandle -> String.valueOf(processHandle.pid())).orElse("N/A")));

        // Equivalent (and superior) code using orElse
        System.out.println("Parent PID: " +
                ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));
    }
}
