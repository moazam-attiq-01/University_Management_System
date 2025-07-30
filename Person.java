/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

public abstract class Person{
	private String name, address;
	private int age;

	public Person(){
		this(null, 1, null);
	}//def-cons

	public Person(String n, int a, String add){
		setName(n);
		setAge(a);
		setAddress(add);
	}//3-arg-cons

	public void setName(String n){
		this.name = n;
	}//setName

	public void setAge(int age){
		if (age < 1) {
			this.age = 1;
		} else {
			this.age = age;
		}//if-else
	}//setAge

	public void setAddress(String add){
		this.address = add;
	}//setAddress

	public String getName(){
		return this.name;
	}//getName

	public int getAge(){
		return this.age;
	}//getAge

	public String getAddress(){
		return this.address;
	}//getAddress
}//class