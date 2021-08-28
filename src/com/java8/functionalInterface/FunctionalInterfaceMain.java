package com.java8.functionalInterface;

public class FunctionalInterfaceMain implements FunctionalInterface {

	@Override
	public int add(int x, int y) {
		int z=x+y;
		return z;
	}
	public void func1() {
		System.out.println(FunctionalInterface.sum(9,6));
	}
	public static void main(String args[]) {
		FunctionalInterfaceMain obj=new FunctionalInterfaceMain();
		System.out.println(obj.add(2, 5));
		//FunctionalInterface fi=new FunctionalInterfaceMain();
		System.out.println(FunctionalInterface.sum(5,6));
		//System.out.println(FunctionalInterface.plus(6,7));	
		new FunctionalInterfaceMain().func1();
	}
}
