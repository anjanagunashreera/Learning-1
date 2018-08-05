package com.learning.example;

/**
 * Encapsulation ,Constructor - default and parameterized constructor,Objects,
 * Access Specifiers, Method signature
 * 
 * @author 611777858
 *
 */
class Student {

	private String name;
	private String gender;
	private String classNum;
	private String section;
	private int age;
	private boolean isStupid;

	Student(String name, String classNum) {
		this.name = name;
		this.classNum = classNum;
	}

	public void printStudent() {
		System.out.println("Student details: " + name + " " + gender + " " + classNum + " " + section + " " + age + " "
				+ isStupid + "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStupid() {
		return isStupid;
	}

	public void setStupid(boolean isStupid) {
		this.isStupid = isStupid;
	}
}

public class StudentTest {
	public static void main(String[] args) {

		Student s = new Student("manasa", null);

		s.setSection("A");
		s.setClassNum("16");
		s.setAge(22);
		s.setStupid(false);
		s.setGender("Female");

		s.printStudent();

		Student s2 = new Student(null, null);
		s2.setSection("B");
		s2.setClassNum("16");
		s2.setName("Gopinatha PR");
		s2.setAge(27);
		s2.setStupid(true);
		s2.setGender("Male");

		s2.printStudent();
	}
}
