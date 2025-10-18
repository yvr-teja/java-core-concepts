package org.java8andlater.Lambda;

import java.util.function.Function;
import java.util.Optional;
import java.util.regex.Pattern;

public class LambdaEx1 {
    // Email regex pattern
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    public static void main(String[] args) {
        // Function to validate email using Optional
        Function<String, Boolean> isValidEmail = email ->
                Optional.ofNullable(email) // Wrap email in Optional
                        .map(String::trim) // Trim spaces
                        .filter(e -> !e.isEmpty()) // Check if empty
                        .filter(e -> EMAIL_PATTERN.matcher(e).matches()) // Validate pattern
                        .isPresent(); // Returns true if valid, else false

        // Test cases
        System.out.println(isValidEmail.apply("test@gmail.com"));   // true
        System.out.println(isValidEmail.apply(" user@domain.com ")); // true (trims spaces)
        System.out.println(isValidEmail.apply("user.test@gave@to.in")); // false
        System.out.println(isValidEmail.apply("invalid-email"));     // false
        System.out.println(isValidEmail.apply(""));                  // false
        System.out.println(isValidEmail.apply(null));                // false
    }
}

