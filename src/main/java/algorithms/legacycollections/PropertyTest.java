package algorithms.legacycollections;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;

public class PropertyTest {

    public static void main(String[] args)
            throws IOException {
        var settings = new Properties();
        settings.setProperty("user", "baraka");
        settings.setProperty("repository", "github");
        settings.setProperty("file", "src/main/resources/properties");

        try (
                var output = new FileWriter("./src/main/resources/program.properties", StandardCharsets.UTF_8, true);
                ){
            settings.store(output, "program properties");
        }
    }
}
