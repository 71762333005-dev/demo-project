package com.example.app;

public class CodeSmellTest {

    public static void main(String[] args) {

        try {
            int denominator = 2;
            int result = 10 / denominator;
            System.out.println(String.format("Result: %d", result));

        } catch (Exception e) {
            System.out.println(String.format("Error occurred: %s", e.getMessage()));
        }

        // Read API key from environment variable
        String apiKey = System.getenv("API_KEY");
        System.out.println(String.format("API Key: %s", apiKey));
    }
}
