package com.learning.example;

class Human {

	String name;
	int age;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Human - " + " " + name + " " + age + " " + address;
	}
}

class Male extends Human {
	boolean smoking;

	public boolean getSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public void printMale() {
		System.out.println("Male - " + " " + name + " " + age + " " + address + " smoking: " + smoking);
	}

}

class Female extends Human {
	boolean isPregnent;

	public boolean isPregnent() {
		return isPregnent;
	}

	public void setPregnent(boolean isPregnent) {
		this.isPregnent = isPregnent;
	}
}

/**
 * 
 * @author 611777858
 *
 */
public class Inheritance {

	public static void main(String[] args) {

		Human h = new Human();

		h.setAddress("Earth");
		h.setAge(100);
		h.setName("Humans");

		// System.out.println(h);

		Male m; // variable creation - 8 bytes
		m = new Male();
		m.setAddress("Bangalore");
		m.setAge(27);
		m.setName("Gopi");
		m.setSmoking(false);

		m.printMale();
	}
}
