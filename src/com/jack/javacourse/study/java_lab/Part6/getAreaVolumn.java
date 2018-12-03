package com.jack.javacourse.study.java_lab.Part6;

interface Area{
    public double getArea(double r);
}

interface Volumn{
    public double getVolumn(double r);
}

class Globe implements Area,Volumn{
    public double getArea(double r){
        return 3.14*4*r*r;
    }
    public double getVolumn(double r){
        return (4/3)*3.14*r*r*r;
    }
}

public class getAreaVolumn {
    public static void main(String[] args) {
        Globe g = new Globe();
        System.out.println("面积： "+g.getArea(10));
        System.out.println("体积： "+g.getVolumn(13));
    }
}
