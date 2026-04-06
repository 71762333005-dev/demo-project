package com.example.app;

public class App {

    // Constant instead of method
    public static final String MESSAGE = "Hello World";

    public static void main(String[] args) {

        // ❌ BAD CODE (add this line)
        String apiKey = "123456"; // hardcoded → vulnerability

        try {
            int x = 10 / 2;
            System.out.println(String.format("Result: %d", x));

        } catch (Exception e) {
            System.out.println(String.format("Error occurred: %s", e.getMessage()));
        }

        System.out.println(MESSAGE);
    }
}
