import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java stream world java";

        Map<String, Long> frequency = Arrays.stream(paragraph.split(" "))
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        frequency.forEach((word, count) -> 
            System.out.println(word + " -> " + count));
    }
}

