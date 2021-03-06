package com.soni;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("Default Constrcuctor");
		System.out.println("==============================");
		System.out.println(e1);
		System.out.println("Parameterised Constrcuctor");
		System.out.println("==============================");

		Employee e2 = new Employee(101, "Riya", 50000.00);
		System.out.println(e2);
		Employee e3 = new Employee(102, "Sanjay", 49999.00);
		System.out.println(e3);

		System.out.println("Setters & Getters");
		System.out.println("==============================");

		Employee e4 = new Employee();
		e4.setEmpId(103);
		e4.setEmpName("Lucky");
		e4.setEmpSalary(120000.00);
		System.out.println(e4);

		Harddisk h1 = new HDD();
		h1.access();
		Harddisk h2 = new SDD();
		h2.access();

		Ram r1 = new DDR3();
		r1.processing();

		Ram r2 = new DDR4();
		r2.processing();
	}

}
