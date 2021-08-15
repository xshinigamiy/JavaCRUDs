package com.example.JavaCRUDs.repository;

import com.example.JavaCRUDs.repository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
