package com.example.SpringWebApp.Repository;

import com.example.SpringWebApp.Model.Author;
import com.example.SpringWebApp.Model.Book;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {



}
