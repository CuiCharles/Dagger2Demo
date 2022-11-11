package com.teld.testdagger.test;

public class A {


	B b;

	public A(B b){
		this.b = b;

	}

	public void eat() {
		System.out.println("吃饭了");
	}
}
