import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackspaceTest {
    @Test
    public void testCleanString() {
        final BackspacesInString bis = new BackspacesInString();
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
    }
}
