package org.example.homework1;

public class Dog {
    public void sayHello() {
        System.out.println("Ав");
    }

    public void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);
    }
}
