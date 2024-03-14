package org.example.Overrridng;

//Super Class (Parent Class)
class Animal{
    public void makeSound(){
        System.out.println("animals make a sound!!!");
    }
}

//Sub Class (child Class)
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

public class Demo {
    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.makeSound(); //

        Dog dog=new Dog();
        dog.makeSound();

        Animal animal1=new Dog();
        animal1.makeSound();

    }
}
