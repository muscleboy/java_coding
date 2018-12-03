package com.jack.javacourse.study.java_lab.Part4;

public class Book{
    String title;
    String author;
    boolean available = true;  //可用
    boolean borrowed = false;   //借出
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void getInfo(){
        System.out.println("书名： "+title+" 作者: "+author);
    }

    boolean isAvailable(){
        return available;
    }

    boolean isBorrowed(){
        return borrowed;
    }

    String borrowed(){
        available = false;
        borrowed = true;
        return title+author;
    }

    String returned(){
        available = true;
        borrowed = false;
        return title+author;
    }

    public static void main(String[] args) {
        Book b = new Book("python web","grey li");
        b.getInfo();
        System.out.println("出租状态：" + b.isBorrowed());
        System.out.println("可用状态：" + b. isAvailable());
        System.out.println("----------借书-----------");
        b.borrowed();
        System.out.println("出租状态：" + b.isBorrowed());
        System.out.println("可用状态：" + b. isAvailable());
        System.out.println("----------还书-----------");
        b.returned();
        System.out.println("出租状态：" + b.isBorrowed());
        System.out.println("可用状态：" + b. isAvailable());
    }
}