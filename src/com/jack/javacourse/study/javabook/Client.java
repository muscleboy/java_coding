package com.jack.javacourse.study.javabook;


interface IDriver{
    public void drive(ICar car);
}

interface ICar{
    public void run();
}

class BWM implements ICar{
    public void run(){
        System.out.println("开宝马！！！");
    }
}

class Benz implements ICar{
    public void run(){
        System.out.println("开奔驰！！！");
    }
}

class Driver implements IDriver{
    public void drive(ICar car){
        car.run();
    }
}

public class Client {
    public static void main(String[] args) {
        IDriver jack = new Driver();
        ICar benz = new Benz();
        jack.drive(benz);
        ICar bwm = new BWM();
        jack.drive(bwm);
    }
}
