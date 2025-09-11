import java.util.*;
import java.util.stream.*;

public class NameTransformer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "charlie", "bob", "david");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}

