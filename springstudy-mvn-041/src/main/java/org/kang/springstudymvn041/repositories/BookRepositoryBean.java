package org.kang.springstudymvn041.repositories;


import org.kang.springstudymvn041.entities.Book;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Optional;

/**
 * 3.3.1. Fine-tuning repository definition
 * @RepositoryDefinition
 */
@NoRepositoryBean
interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    Optional<T> findById(ID id);
    <S extends T> S save(S entity);
}

public interface BookRepositoryBean extends MyBaseRepository<Book, Integer> {
    Optional<Book> findByName(String name);
}
