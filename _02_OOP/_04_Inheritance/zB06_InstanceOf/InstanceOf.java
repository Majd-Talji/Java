/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02_OOP._04_Inheritance.zB06_InstanceOf;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class InstanceOf {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println(dog1 instanceof Dog);
        System.out.println(dog1 instanceof Animal);

    }

}

// Animal
class Animal {
}

// Mammals, Reptiles, Birds, Aquatic
class Mammals extends Animal {
}

class Reptiles extends Animal {
}

class Birds extends Animal {
}

class Aquatic extends Animal {
}

// Dog, Snack, Parrot, Dolphin
class Dog extends Mammals {
}

class Snack extends Reptiles {
}

class Parrot extends Birds {
}

class Dolphin extends Aquatic {
}
