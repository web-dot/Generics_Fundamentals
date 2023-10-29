package com.generics.C_generic_methods;

class Pair<K, V>{
	
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {return this.key;}
	public V getValue() {return this.value;}
}


public class TestGenericMethods {
	// Generic methods are methods that introduce their own type parameters
	// Type parameters scope is limited to the method
	// static, non-static generic methods, and generic class constructors are allowed

	/**
	 * in generic methods the list of type parameters in angle brackets should
	 * appear before the return type 
	 * */
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
	
	
	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		
		boolean same = compare(p1, p2);
		
		System.out.println(same);
		
	}
	
	
	
}
