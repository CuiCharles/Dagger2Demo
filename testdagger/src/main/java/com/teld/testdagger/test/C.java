package com.teld.testdagger.test;

import javax.inject.Inject;

public class C {

	D d;

	@Inject
	public C(D d){
		this.d = d;
	}

	public void doSth(){
		System.out.println("do some thing");
	}
}
