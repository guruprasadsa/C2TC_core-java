package com.tnsif.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<>();
		obj.setData("Hello");
		System.out.println(obj.getData());
		GenericClass<Integer> obj1 = new GenericClass<>();
		obj1.setData(13);
		System.out.println(obj1.getData());
//		GenericClass<Integer> obj2 = new GenericClass<>();
//		obj2.setData(new Person());
//		System.out.println(obj2.getData());

	}

}
