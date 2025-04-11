package com.finatrack.financeTracker.repositories;

import com.finatrack.financeTracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // // Generates SQL: SELECT * FROM users WHERE email = ?
}
