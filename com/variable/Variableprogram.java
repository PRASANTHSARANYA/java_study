package com.variable;

public class Variableprogram {
	static int num =10;//static variable
	public static void main(String[]args) {
		int x = 12;
		
		int num  = 12;//instance variable
		System.out.println(x);
		System.out.println(Variableprogram.num);
		name(num);
	}
	public static void name(int a) {
		System.out.println(a);
		int b= 6;//local variable
		System.out.println(a+b);
		
	}

}
