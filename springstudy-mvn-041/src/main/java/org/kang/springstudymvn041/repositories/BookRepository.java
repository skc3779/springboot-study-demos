package org.kang.springstudymvn041.repositories;


import org.kang.springstudymvn041.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findByName(String name);
    @Async
    CompletableFuture<Book> findByAuthor(String author);
}

/*
@RepositoryDefinition(domainClass = Book.class, idClass = Integer.class)
public interface BookRepository {
}
*/
