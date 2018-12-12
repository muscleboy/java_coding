package com.jack.javacourse.study.java_lab.Part7;

class ExceptionTest1{
    void test(String s){
        try{
            if(s.equals("XYZ"))
                System.out.println("抛出的异常");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        ExceptionTest1 et = new ExceptionTest1();
        et.test("XYZ");
    }
}
