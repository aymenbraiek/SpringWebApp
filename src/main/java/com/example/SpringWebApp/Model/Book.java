package com.example.SpringWebApp.Model;

import java.util.HashSet;
import java.util.Set;

public class Book {
private String title;
private String isbn;
private String pubLisher;
private Set<Author> authors=new HashSet<>();

}
