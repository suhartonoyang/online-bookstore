package id.co.onilnebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.co.onilnebookstore.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
