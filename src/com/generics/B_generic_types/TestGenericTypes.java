package com.generics.B_generic_types;

// Listing1
// non generic Box class : 
//class Box{
//	private Object object;
//	public void set(Object object) {this.object = object;}
//	public Object get() {return this.object;}
//}

// Listing1
// generic type declaration
// generic Box class
class Box<T>{
	// T stands for type
	private T t;
	public void set(T t) {this.t = t;}
	public T get() {return this.t;}
}

/**
 * Multiple Type parameters
 * */
interface Pair<K, V>{
	public K getKey();
	public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V>{
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {return this.key;}
	public V getValue() {return this.value;}
}


public class TestGenericTypes {

	// A `Generic type` is a generic class or interface that is parameterized over types. 
	// The `Box` class will be modified to demonstrate the concept
	
	/**
	 * non generic Box class ---------- Listing1
	 * */
	// one part of code can place a Integer in the box and expect to get an Integer, while another part  of the code
	// can mistakenly pass a String, resulting in a runtime error
	
	/**
	 * A Generic Version of the Box class ---------- Listing2
	 */
	
	// A generic class is defined with the following format:
	
	// class name<T1, T2, ..., Tn> { /***/ }
	
	
	/**
	 * Generic type invocation
	 * */
	Box<Integer> integerBox; // you are passing a type argument
	
	
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		
	}
	
	
	
}
