package com.example.bookservice;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.example.DAO.BookRepository;
import com.example.entitymodel.*;


@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list = new ArrayList<>();
//static {
//	list.add(new Book(12,"Java Complete Ref","XYZ"));
//	list.add(new Book(36,"Java Complete ","ASD"));
//	list.add(new Book(42,"Thimk java Complete Ref","XER"));
//}
public List<Book> getAllBooks()
{
	//return list;
	
 List<Book> list =(List<Book>)this.bookRepository.findAll();
 return list;
}

public Book getBookById(int id)
{
	Book book=null;
	try {
	//book=list.stream().filter(e->e.getId() == id).findFirst().get();
		book=this.bookRepository.findById(id);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return book;
}

//Adding the book
//public Book addBook(Book b) {
//	list.add(b);
//	return b;
//}

public Book addBook(Book book) {
	// TODO Auto-generated method stub
	//list.add(book);
	
	Book result = bookRepository.save(book);
	return result;
}



public void deleteBook(int bookId) {
	// TODO Auto-generated method stub
//	list=list.stream().filter(book->{
//		if(book.getId()!=bookId) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}).collect(Collectors.toList());
	
	bookRepository.deleteById(bookId);
	
}

public void updateBook(Book book, int bookId) {
	// TODO Auto-generated method stub
//	list=list.stream().map(b->{
//		if(b.getId()==bookId) {
//			b.setTitle(book.getTitle());
//			b.setAuthor(book.getAuthor());
//		}
//		return b;
//	}).collect(Collectors.toList());
//	
//
	book.setId(bookId);
	bookRepository.save(book);
	}


}
