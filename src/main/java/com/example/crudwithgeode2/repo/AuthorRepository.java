package com.example.crudwithgeode2.repo;

import com.example.crudwithgeode2.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
