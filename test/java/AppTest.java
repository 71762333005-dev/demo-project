package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMessage() {
        assertEquals("Hello World", App.MESSAGE);
    }

    @Test
    void testDivision() {
        int result = 10 / 2;
        assertEquals(5, result);
    }
}
