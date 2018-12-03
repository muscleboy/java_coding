package com.jack.javacourse.study.java_lab.Part6;

interface PCI{
    public void start();
    public void stop();
}

class NetworkCard implements PCI{
    public void start(){
        System.out.println("send.......");
    }
    public void stop(){
        System.out.println("network stop");
    }
}

class SoundCard implements PCI{
    public void start(){
        System.out.println("Du Du.....");
    }
    public void stop(){
        System.out.println("sound stop");
    }
}

class MainBoard{
    public void usePCICard(PCI p){
        p.start();
        p.stop();
    }
}

public class PciExample{
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        NetworkCard nc = new NetworkCard();
        mb.usePCICard(nc);

        SoundCard sc = new SoundCard();
        mb.usePCICard(sc);
    }
}


//interface PCI{
//    void start();   //接口里的方法是抽象的，实现这个接口必须实现它的抽象方法
//    void stop();
//}
//
//class NetworkCard implements PCI{
//    public void start(){
//        System.out.println("send....");
//    }
//    public void stop(){
//        System.out.println("Network stop!");
//    }
//}
//
//class SoundCard implements PCI{
//    public void start(){
//        System.out.println("du du....");
//    }
//    public void stop(){
//        System.out.println("Sound stop");
//    }
//}
//
//class MainBoard{
//    //传入PCI类型对象
//    public void userPCICard(PCI p){
//        p.start();
//        p.stop();
//    }
//}
//
//
//public class PciExample {
//    public static void main(String[] args) {
//        MainBoard mb = new MainBoard();
//        NetworkCard nc = new NetworkCard();
//        mb.userPCICard(nc);
//
//        SoundCard sc = new SoundCard();
//        mb.userPCICard(sc);
//    }
//}
