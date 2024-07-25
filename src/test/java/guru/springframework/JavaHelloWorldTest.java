package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();

        assertEquals("Hello World", helloWorld.getHello());
    }
}