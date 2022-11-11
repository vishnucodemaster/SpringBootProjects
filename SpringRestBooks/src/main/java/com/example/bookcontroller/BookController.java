package com.example.bookcontroller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.BookRepository;
import com.example.DAO.OrderRepository;
import com.example.bookservice.BookService;
import com.example.entitymodel.Book;
import com.example.entitymodel.BookOrder;

@RestController
public class BookController {
	
	//@RequestMapping(value ="/books",method=RequestMethod.GET)
	@Autowired
	private BookService bookService;
	@GetMapping(value="/books")
	//@ResponseBody if restcontroller there then no use of response body
	public ResponseEntity<List<Book>> getBooks() {
		
		//return this.bookService.getAllBooks();
		List<Book> list = this.bookService.getAllBooks();
		if(list.size()<=0) {
		return	 ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} 
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/test")
	public String handleRequestHeader (@RequestHeader Map<String,String> mapValues) {
		System.out.print("printing the header"+mapValues);
		return "Success";
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book>getBook(@PathVariable("id") int id) {
	//public Book getBook(@RequestParam int id){
		//return bookService.getBookById(id);
		
		Book book =bookService.getBookById(id);
		if(book==null) {
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		return  ResponseEntity.of(Optional.of(book));
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b= null;
		try {
 b=this.bookService.addBook(book);
 return ResponseEntity.of(Optional.of(b));
		}catch(Exception e) {
			e.printStackTrace();
			return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<Void>  deleteBook(@PathVariable("bookId") int bookId) {
		try {
			this.bookService.deleteBook(bookId);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}catch(Exception e){
			e.printStackTrace();
			return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}

	@PutMapping("books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		
		this.bookService.updateBook(book,bookId);
		return book;
	}
	
	@Autowired private OrderRepository orderRepository;
	@PostMapping("/ordercreate")
	public BookOrder save(@RequestBody BookOrder order) {
		return orderRepository.save(order);
	}
}
