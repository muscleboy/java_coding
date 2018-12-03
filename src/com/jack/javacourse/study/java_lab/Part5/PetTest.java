package com.jack.javacourse.study.java_lab.Part5;

class Pet{
    protected String name;
    public Pet(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public String move(){
        return "move!!";
    }

    public String speak(){
        return "speak";
    }

    public String toString(){
        return "my pet " + name;
    }
}

class Dog extends Pet{
    protected int weight;
    public Dog(String s,int weight){
        super(s);
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public String speak(String s){
        return s;
    }

}

public class PetTest {
    public static void main(String[] args) {
        Pet myPet = new Pet("George");
        Dog myDog = new Dog("Spot",20);
        Dog myDog1 = new Dog("snoopy",10);
        System.out.println(myPet.toString()+"\n"+"Speak: "+myPet.speak()+"\n"+myPet.move()+" "+myPet.getName()+"\n");
        System.out.println(myDog.toString()+"\n"+"Speak: "+myDog.speak("Woof")+"\n"+myDog.move()+" "+myDog.getName()+"\n");
        System.out.println(myDog1.toString()+"\n"+"Speak: "+myDog1.speak("woof")+"\n"+myDog1.move()+" "+myDog1.getName()+"\n"+"Weight: "+myDog1.getWeight());
//        System.out.println("mydog is "+myDog.getWeight()+"kg");
    }
}
