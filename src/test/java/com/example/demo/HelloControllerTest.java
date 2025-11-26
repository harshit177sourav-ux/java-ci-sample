package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    void shouldReturnGreeting() {
        HelloController controller = new HelloController();
        assertThat(controller.hello()).isEqualTo("Hello, Harshit!");
    }
}
