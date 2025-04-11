package com.finatrack.financeTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.finatrack.financeTracker.models.User;
import com.finatrack.financeTracker.repositories.UserRepository;

@SpringBootApplication
public class FinanceTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinanceTrackerApplication.class, args);
    }

    // CommandLineRunner runs code at startup, saving a test user to the DB
    @Bean
    public CommandLineRunner testDatabase(UserRepository userRepository) {
        return args -> {
            // Creating a test user
            User user = new User("John Doe");
            userRepository.save(user);
            System.out.println("User saved: " + user.getName());
        };
    }
}