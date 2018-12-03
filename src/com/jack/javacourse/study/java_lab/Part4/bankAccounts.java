package com.jack.javacourse.study.java_lab.Part4;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class bankAccounts {
    public static Scanner input = new Scanner(System.in);  //添加一个scanner对象的成员变量，需要输入时，调用input.next()
    private static boolean breakout = false;  //退出系统
    String id = UUID.randomUUID().toString();  //生成唯一id
    String name;
    Date startTime = new Date();
    String pwd = "123456";  //初始密码
    double balance = 0;     //初始余额
    public bankAccounts(String name){
        this.name = name;
        this.id = id;
        this.startTime = startTime;
        this.pwd = pwd;
        this.balance = balance;
    }

    public double saveMoney(){
        System.out.println("请输入存款金额: ");
        double money = input.nextDouble();
        balance += balance + money;
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public Date getTime(){
        return startTime;
    }

    public double getBalance(){
        return balance;
    }

    public double getMoney(){
        System.out.println("请输入取款金额: ");
        double money = input.nextDouble();
        if (balance < money){
            System.out.println("余额不足");
        }
        else {
            balance -= money;
        }
        return balance;
    }

    public String changPwd(){
        System.out.println("修改密码");
        String newPwd = input.next();
        System.out.println("密码变更为： "+newPwd);
        return newPwd;
    }

//    public void getInfo(){
//        System.out.println("---------当前账户信息-----------");
//        System.out.println("name: "+name+" id: "+id);
//        System.out.println(" 开户时间: "+startTime+" 当前余额"+balance);
//    }

    public void confirmPwd(){
        System.out.println("-------欢迎来到支付宝银行--------");
        System.out.println("请输入密码: ");
        int times = 3;
        while (times>0){
            String pwdIn = input.next();
            if(pwd.equals(pwdIn)){
                System.out.println("密码正确！");
                break;
            }
            else{
                times--;
                System.out.println("密码错误，你还有"+times+"次机会");
                if(times<=0){
                    System.out.println("输出错误密码次数过多,退出系统!");
                    breakout = true;
                }
            }
        }
    }

    public void action(){
        System.out.println("输入1：显示当前账户id，2：账户姓名，3：开户日期，4：查询余额，5：存款，6：取款, 7:修改密码，8：退出");
        int num = input.nextInt();
        switch (num){
            case 1:
                System.out.println("账户id: "+getId());
                break;
            case 2:
                System.out.println("账户名: "+getName());
                break;
            case 3:
                System.out.println("开户时间： "+getTime());
                break;
            case 4:
                System.out.println("当前余额为： "+getBalance());
                break;
            case 5:
                System.out.println("存款金额为： "+saveMoney()+",当前余额为： "+getBalance());
                break;
            case 6:
                System.out.println("取款金额为： "+getMoney()+",当前余额为： "+getBalance());
                break;
            case 7:
                System.out.println("当前密码为： "+changPwd());
                break;
            case 8:
                breakout = true;
                System.out.println("欢迎下次再来");
                break;
        }
    }

    public static void main(String[] args) {
        bankAccounts b = new bankAccounts("jack");
        b.confirmPwd();
        while (breakout != true){
            b.action();
        }
    }
}
