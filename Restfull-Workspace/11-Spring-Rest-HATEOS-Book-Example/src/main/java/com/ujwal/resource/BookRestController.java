package com.ujwal.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value="/book/{isbn}",produces = {"application/json"})
	public Book getBookInfo(@PathVariable("isbn") String isbn) {
		
		Book b=new Book();
		b.setIsbn(isbn);
		b.setName("Spring");
		b.setPrice(356.00);
		b.setAuthor("Rod Jonson");
		
		Link withSelfRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
				                            .methodOn(BookRestController.class).getAllBooks())
				                            .withSelfRel();
		b.add(withSelfRel);
		
	/*	Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class)
				                                       .getAllBooks()).withRel("All-Books");  */
	//	b.add(link);
		
		return b;
	}
	
	@GetMapping(value="/books",produces = {"application/json"})
	public List<Book> getAllBooks(){
		
		List<Book> books=new ArrayList<Book>();
		
		Book b1=new Book();
		b1.setIsbn("Sbin001N");
		b1.setName("Spring");
		b1.setPrice(355.00);
		b1.setAuthor("Rod Jonson");
		
		Book b2=new Book();
		b2.setIsbn("REST001N");
		b2.setName("RESTFULL");
		b2.setPrice(255.00);
		b2.setAuthor("Roy Fielding");
		
		Book b3=new Book();
		b3.setIsbn("C001N");
		b3.setName("C-language");
		b3.setPrice(155.00);
		b3.setAuthor("BalaGuruShwamy");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		return books;
	}

}
