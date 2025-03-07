package com.example.crudapi.Repository;

// import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Optional<User> findByEmail(String Email);
    // List<User> findActiveUsers();
}
