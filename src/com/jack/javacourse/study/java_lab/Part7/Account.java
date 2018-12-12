package com.jack.javacourse.study.java_lab.Part7;


class NegativeAmountException extends Exception{
    NegativeAmountException(String s){
        super(s);
    }
}

class Account{
    double balance;
    public Account(){
        balance = 0;
    }
    public Account(double n)throws NegativeAmountException{
        if(n > 0){
            this.balance = n;
        }else{
            throw new NegativeAmountException("余额小于0");
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount)throws NegativeAmountException{
        if(amount >= 0){
            balance += amount;
        }else{
            throw new NegativeAmountException("存款出错");
        }
    }
    public void withdraw(double amount)throws NegativeAmountException{
        if(amount < 0){
            throw new NegativeAmountException("操作错误");
        }else if(balance < amount){
            throw new NegativeAmountException("取款错误");
        }else {
            balance -= amount;
        }
    }

    public static void main(String[] args) throws NegativeAmountException{
        Account a = new Account();
        a.deposit(500);
        System.out.println(a.getBalance());
        a.withdraw(600);
        System.out.println(a.getBalance());
    }
}


