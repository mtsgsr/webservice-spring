package com.mtsgsr.webservicespring.repositories;

import com.mtsgsr.webservicespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
