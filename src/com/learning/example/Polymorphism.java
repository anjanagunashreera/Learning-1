package com.learning.example;

public class Polymorphism {

	public static void main(String[] args) {

		Animal a;
		// a = new Animal(); // we cannot create object for an interface
		// a = new Bird(); // we cannot create object for an interface
		Bird b = null;
		// b = new Bird(); // we cannot create object for an interface

		// b = a; // child classes/interfaces variable cannot point to super
		// classes/interfaces
		// variable

		a = b; // base variable can point to sub class or interface

		Parrot p = new Parrot(); // declaring the variable and crating the object at the same time

		a = p;
		b = p;
		// p = b;
		// p = a;

		p = new ChildParrot(); // possible

		b = new Parrot();

		b.eat();
		b.fly();
		b.die();

	}
}

interface Animal {

	public void eat();

	public void die();

}

interface Bird extends Animal {

	public void fly();
}

class Parrot implements Bird {

	@Override
	public void eat() {

		System.out.println("I eat apple");
	}

	@Override
	public void die() {
		System.out.println("I die when I am old");

	}

	@Override
	public void fly() {
		System.out.println("I fly in search of food");
	}

	public void beautiful() {
		System.out.println("ofcourse I am damn beautifull");

	}
}

class ChildParrot extends Parrot {

}