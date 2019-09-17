package com.example.SpringWebApp.Repository;

import com.example.SpringWebApp.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
