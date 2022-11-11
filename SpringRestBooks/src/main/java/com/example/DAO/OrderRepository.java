package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entitymodel.Book;
import com.example.entitymodel.BookOrder;


public interface OrderRepository extends JpaRepository<BookOrder,Long> {

}
