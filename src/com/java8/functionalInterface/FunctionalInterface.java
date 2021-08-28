package com.java8.functionalInterface;
public interface FunctionalInterface {
	public abstract int add(int x,int y);
	public static int sum(int x,int y) {
		int z=x+y;
		return z;
	}
	public default int plus(int x,int y) {
		return x+y;
	}
}
