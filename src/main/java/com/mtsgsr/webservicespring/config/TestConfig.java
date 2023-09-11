package com.mtsgsr.webservicespring.config;

import com.mtsgsr.webservicespring.entities.Order;
import com.mtsgsr.webservicespring.entities.User;
import com.mtsgsr.webservicespring.entities.enums.OrderStatus;
import com.mtsgsr.webservicespring.repositories.OrderRepository;
import com.mtsgsr.webservicespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Alex Scott", "alex@gmail.com", "12345678", "123456");
        User u2 = new User(null, "James Williams", "james@gmail.com", "87654321", "123456");

        Order o1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
