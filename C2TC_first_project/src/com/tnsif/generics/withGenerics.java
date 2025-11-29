package com.tnsif.generics;

import java.util.ArrayList;

public class withGenerics {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("String");
//		al.add(123);
		
		for(String string:al)
		{
			String s = string;
			System.out.println(s);
		}
		

	}

}
