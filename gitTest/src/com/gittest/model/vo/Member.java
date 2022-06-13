package com.gittest.model.vo;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
<<<<<<< HEAD
		return "name=" + name + ", age=" + age;
=======
		return "Member [name=" + name + ", age=" + age + "]";
>>>>>>> branch 'goodee' of https://github.com/JakePark929/gittest.git
	}
	
}
