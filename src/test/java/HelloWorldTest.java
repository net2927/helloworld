import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {
    @Test
    public void indexPageContainsHelloWorld() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/webapp/index.jsp")));
        assertTrue(content.contains("Hello World"));
    }
}
