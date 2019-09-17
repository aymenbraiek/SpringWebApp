package com.example.SpringWebApp;

import com.example.SpringWebApp.Bootsrap.DevBootstrap;
import com.example.SpringWebApp.Model.Author;
import com.example.SpringWebApp.Model.Book;
import com.example.SpringWebApp.Model.PubLisher;
import com.example.SpringWebApp.Repository.AuthorRepository;
import com.example.SpringWebApp.Repository.BookRepository;
import com.example.SpringWebApp.Repository.PubLisherRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.spel.ast.NullLiteral;

@SpringBootApplication
public class SpringWebAppApplication implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PubLisherRepository pubLisherRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringWebAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	initData();

    }

	private void initData() {
    	PubLisher pubLisher=new PubLisher();
    	pubLisher.setName("imprim 714");
    	pubLisher.setAddress("ariana ");
    	pubLisherRepository.save(pubLisher);


		System.out.println("i am here ");
		//Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", pubLisher);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		//Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEjb = new Book("J2EE Developement without EJB", "2344",pubLisher);
		rod.getBooks().add(noEjb);
		authorRepository.save(rod);
		bookRepository.save(noEjb);

	}
}
