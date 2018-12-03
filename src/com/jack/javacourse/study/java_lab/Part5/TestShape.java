//package com.jack.javacourse.study.java_lab;
//
//class Shape{
//    String color;
//    void Shape(String color){
//        this.color = color;
//    }
//
//    String show(){
//        return color;
//    }
//
//    double getArea() {
//        return 0;
//    }
//
//}
//
//class Circle extends Shape{
//    double r;
//    Circle(String color,double r){
//        this.color = color;
////        super(color);
//        this.r = r;
//    }
//
//    double getArea(){
//        return 3.14*r*r;
//    }
//
//}
//
//class Rectangle extends Shape{
//    double a,b;
//    Rectangle(String color, double a, double b){
//        this.color = color;
//        this.a = a;
//        this.b = b;
//    }
//
//    double getArea(){
//        return a*b;
//    }
//}
//
//public class TestShape {
//    public static void main(String[] args) {
//        Circle c = new Circle("blue",20.2);
//        Rectangle r = new Rectangle("green",10,20);
//        System.out.println("颜色: "+c.show()+" 面积: "+c.getArea());
//        System.out.println("颜色: "+r.show()+" 面积: "+r.getArea());
//    }
//}
