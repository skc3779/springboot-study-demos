package org.kang.springstudymvn041.repositories;

import org.kang.springstudymvn041.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
}
