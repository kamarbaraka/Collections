package sets;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

public class SetTest {

    public static void main(String[] args) throws IOException {
        var words = new HashSet<String>();
        var totalTime = 0L;

        var path = Path.of("./src/main/resources/input.txt");

        try (var input = new Scanner(path, StandardCharsets.UTF_8)){
            while (input.hasNext()){
                String word = input.next();
                var callTime = System.currentTimeMillis();
                words.add(word);
                callTime -= System.currentTimeMillis();
                totalTime += callTime;
            }
        }
        var wordsIter = words.iterator();
        for (int i = 1; i < 21 && wordsIter.hasNext(); i++)
            System.out.println(wordsIter.next());
        System.out.println(".........");
        System.out.printf("%s words. total time %s \n", words.size(), totalTime);
    }
}
