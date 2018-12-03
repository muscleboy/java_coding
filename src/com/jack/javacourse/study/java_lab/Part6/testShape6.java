package com.jack.javacourse.study.java_lab.Part6;

abstract class Shape{
    abstract double getShape();
    abstract double getArea();
}

class Circle extends Shape{
    double r=3;
    final double PI = 3.14;
    double getArea(){
        return PI*r*r;
    }
    double getShape(){
        return 2*PI*r;
    }
}

class Rectangle extends Shape{
    double a=2,b=4;
    double getArea(){
        return a*b;
    }
    double getShape(){
        return 2*a+2*b;
    }
}

class ShapeCalculate{
    String ShapeCalculate(Circle c){
//        c.getArea();
//        c.getShape();
//        r.getArea();
//        r.getShape();
        return "圆面积: "+c.getArea()+" 圆周长: "+c.getShape();
    }
    String ShapeCalculate(Rectangle r){
        return "长方形面积: "+r.getArea()+" 长方形周长: "+r.getShape();
    }

}

public class testShape6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        ShapeCalculate sc = new ShapeCalculate();
        System.out.println(sc.ShapeCalculate(c));
        System.out.println(sc.ShapeCalculate(r));
    }
}
