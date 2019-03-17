package com.jack.javacourse.study.javabook.Part7_Exception.Part3;

public class LibSys {
    static Book book[] = new Book[3];
    public void init(){
        book[0].name = "Flask";
        book[0].stat = true;
        book[0].times = 0;

        book[1].name = "Python核心编程";
        book[1].stat = true;
        book[1].times = 0;

        book[2].name = "流畅的Python";
        book[2].stat = true;
        book[2].times = 0;
    }

    public static void main(String[] args) {
        LibSys ls = new LibSys();
        ls.init();
//        for(int i=0; i<book.length; i++){
//            System.out.println(book[i]);
//        }
        System.out.println(book[0].name);
    }
}

class Book{
    String name;
    //是否可借
    boolean stat = true;
    int times;
}