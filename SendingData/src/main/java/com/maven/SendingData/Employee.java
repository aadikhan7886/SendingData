package com.maven.SendingData;

public class Employee {
private int id;
private String name;
private double salary;
private String address;
private long mobileNo;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public Employee(int id, String name, double salary, String address, long mobileNo) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
	this.mobileNo = mobileNo;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", mobileNo="
			+ mobileNo + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}



}
