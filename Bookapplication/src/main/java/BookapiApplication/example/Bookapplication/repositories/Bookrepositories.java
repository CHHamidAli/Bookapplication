package BookapiApplication.example.Bookapplication.repositories;


import BookapiApplication.example.Bookapplication.Entity.Book;

import BookapiApplication.example.Bookapplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepositories extends JpaRepository<Book,Long> {

}
