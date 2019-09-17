package com.example.SpringWebApp.Bootsrap;

import com.example.SpringWebApp.Model.Author;
import com.example.SpringWebApp.Model.Book;
import com.example.SpringWebApp.Repository.AuthorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextClosedEvent> {

    private AuthorRepository authorRepository;
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        initData();
    }
    private void initData()
    {
        //Eric
    /*    Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
    //Rod
        Author rod=new Author("Rod","Johnson");
        Book noEjb=new Book("J2EE Developement without EJB","2344","Worx");
        rod.getBooks().add(noEjb);*/

    }


}
