package com.xx3.git;

public class HelloSvn implements person{
	public static void main(String[] args) {
		System.out.println(person.id);
		HelloSvn hs = new HelloSvn();
		System.out.println(hs.getid(10));
	}

	@Override
	public int getid(int id) {
		return 0;
	}
}

interface  person{
	public static final int id = 10;	
	public abstract int getid(int id);
	
}

class Fruit {
	String name;
	double color;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, double color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getColor() {
		return color;
	}

	public void setColor(double color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}
	

}