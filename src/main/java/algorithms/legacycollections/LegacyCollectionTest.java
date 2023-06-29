package algorithms.legacycollections;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class LegacyCollectionTest {

    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        try (var input = new FileReader("./src/main/resources/program.properties", StandardCharsets.UTF_8)){
            settings.load(input);
        }

        System.out.println(settings.getProperty("user"));
    }
}
