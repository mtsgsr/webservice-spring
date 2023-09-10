package com.mtsgsr.webservicespring.config;

import com.mtsgsr.webservicespring.entities.User;
import com.mtsgsr.webservicespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Alex Scott", "alex@gmail.com", "12345678", "123456");
        User u2 = new User(null, "James Williams", "james@gmail.com", "87654321", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
