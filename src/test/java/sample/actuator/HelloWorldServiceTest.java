package sample.actuator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceTest {

    @Test
    public void expectedMessage() {
        HelloWorldService helloWorldService = new HelloWorldService();
        assertEquals("Expected correct message", "Spring boot says hello from a Docker container", helloWorldService.getHelloMessage());
    }

}
