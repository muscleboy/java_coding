package com.jack.javacourse.study.java_lab.Part7;

public class TestException2 {
    public static void main(String[] args) {
        try{
            int i = 0;
            int j = 1/i;
            String myname = null;
            if(myname.length()>2){
                System.out.println("1");
            }
        }catch (NullPointerException e){
            System.out.println("2");
        }catch (Exception e){
            System.out.println("3");
            System.out.println(e);
        }
    }
}
