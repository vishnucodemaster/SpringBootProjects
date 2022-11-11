package com.example.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entitymodel.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{
 public Book findById(int id);
 

// public List<Book> getAllBooks();
 //@Query("select u from Book u")
public List<Book> findByName(String name);
}
