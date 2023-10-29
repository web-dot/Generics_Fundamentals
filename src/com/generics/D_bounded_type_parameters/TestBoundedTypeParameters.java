package com.generics.D_bounded_type_parameters;

public class TestBoundedTypeParameters {
	
	/**
	 * bounded type parameters
	 * */
	public static <U extends Number> void inspect(U u) {
		System.out.println(u.getClass().getName());
	}
	
	/**
	 * multiple bounds, the class type variable must come first
	 * */
	class A{}
	interface B{}
	interface C{}
	class D <T extends A & B & C>{ // class argument must come first
		
	}
//	class D1 <T extends C & B & A>{ // this do not work
//		
//	}
	
	
	/**
	 * Bounded type parameters for generic algorithms
	 * */
	
	// unbounded type parameter
	public static <T> int countGreaterThan(T[] arr, T elem) {
		int count = 0;
		for(T e : arr) {
//			if(e > elem) { // this does not work, cannot use `>` for objects
//				count++;
//			}
		}
		return count;
	}
	
	// bounded type parameter
	public static <T extends Comparable<T>> int countGreaterThanBounded(T[] arr, T elem) {
		int count = 0;
		for(T e : arr) {
			if(e.compareTo(elem) > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Integer i = new Integer(10);
		inspect(i);
//		inspect("10"); // this doesn't work
		
	}
}
