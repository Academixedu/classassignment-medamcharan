package com.example; 

 public class  Book {
    private String title;
    private String author;
    private int noofcopies;

    public Book(String author, int noofcopies, String title) {
        this.author = author;
        this.noofcopies = noofcopies;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoofcopies() {
        return noofcopies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoofcopies(int noofcopies) {
        this.noofcopies = noofcopies;
    }
    public void  displayBookDetails( ){
        System.out.println("title"+title);
        System.out.println("author"+author);
        System.out.println("noofcopies "+noofcopies);

    }
    public void totalBooks(int totalBooks) {
        System.out.println("total number of books created"+ totalBooks);

    }





 }