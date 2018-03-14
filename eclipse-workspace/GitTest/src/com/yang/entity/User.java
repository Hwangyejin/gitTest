package com.yang.entity;

// 기본 생성자, 인자 3개 받는 생성자, setter & getter
public class User {
	private String name;
	private int age;
	private double score;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
