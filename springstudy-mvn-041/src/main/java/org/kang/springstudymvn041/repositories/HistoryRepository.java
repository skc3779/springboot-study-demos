package org.kang.springstudymvn041.repositories;

import org.kang.springstudymvn041.entities.Book;
import org.kang.springstudymvn041.entities.History;
import org.kang.springstudymvn041.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Integer> {
    List<History> findByUser(User user);
    List<History> findByBook(Book book);
}
