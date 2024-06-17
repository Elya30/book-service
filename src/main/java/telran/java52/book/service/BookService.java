package telran.java52.book.service;

import telran.java52.dto.AuthorDto;
import telran.java52.dto.BookDto;

public interface BookService {
	
 Boolean addBook(BookDto bookDto);
 
 BookDto findBookByIsbn(String isbn);
 
 BookDto removeBook(String isbn);
 
 BookDto updateBookTitle(String isbn, String title);
 
 Iterable<BookDto> findBooksByAuthor(String author);
 
 Iterable<BookDto>findBooksByPublisher(String publisherName);
 
 Iterable<AuthorDto> findBookAuthors(String isbn);
 
 Iterable<String> findPublishersByAuthor(String author);
 
 AuthorDto removeAuthor(String author);
 
 
 
 

}
