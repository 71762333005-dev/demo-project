package com.example.app;

public class App {

    // Constant instead of method
    public static final String MESSAGE = "Hello World";

    public static void main(String[] args) {

        // ✅ FIX: Read API key from environment variable (no hardcoding)
        String apiKey = System.getenv("API_KEY");

        try {
            int denominator = 2;

            if (denominator != 0) {
                int result = 10 / denominator;
                System.out.println(String.format("Result: %d", result));
            } else {
                System.out.println("Denominator cannot be zero.");
            }

        } catch (ArithmeticException e) {
            System.out.println(String.format("Arithmetic error: %s", e.getMessage()));
        } catch (Exception e) {
            System.out.println(String.format("Unexpected error: %s", e.getMessage()));
        }

        System.out.println(MESSAGE);
    }
}
