package org.kang.springstudymvn041.repositories;


import org.kang.springstudymvn041.entities.Book;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

/**
 * 3.3.1. Fine-tuning repository definition
 * @RepositoryDefinition
 */
@RepositoryDefinition(domainClass = Book.class, idClass = Integer.class)
public interface BookRepositoryDef {
    Optional<Book> findByName(String name);
}
