package com.jack.javacourse.study.java_lab.Part6;

class Complex{
    double real,im;
    public Complex(double real,double im){
        this.real = real;
        this.im = im;
    }

    public Complex(){
        this(0,0);
    }

    public Complex(double real){
        this(real,0);
    }

    String Add(double real1,double im1){
        this.real = real + real1;
        this.im = im + im1;
        return this.real+"+"+this.im+"i";
    }

    String Sub(double real1,double im1){
        this.real = real - real1;
        this.im  = im - im1;
        return this.real+"+"+this.im+"i";
    }
    String equals(double real,double im){
        if(this.real==real && this.im==im){
            return this.real+"+"+this.im+"i"+" = "+real+"+"+im+"i";
        }else{
            return this.real+"+"+this.im+"i"+" != "+real+"+"+im+"i";
        }
    }

    String toString(double real2,double im2){
        return real2+"+"+im2+"i";
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        Complex c3 = new Complex();
        System.out.println(c1.Add(3,5));
        System.out.println(c2.Sub(3,1));
        System.out.println(c3.toString(1,2));
        System.out.println(c1.equals(4,5));
    }
}
