package jni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {

    @Test
    void testFooBar() {
        SimpleStreamServer simpleStreamServer = new SimpleStreamServer();
        assertEquals(simpleStreamServer.foo(), "foo");
        assertEquals(simpleStreamServer.bar(), "bar");
    }
}