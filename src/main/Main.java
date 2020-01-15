package main;

import second.Fruit;

/**
 * @author phoenix
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main(String arg) {
		// TODO Auto-generated constructor stub
		Fruit theFruit = new Fruit(arg);
		theFruit.sayHello();
	}

	/**
	 *  b bbnhnhn
	 *   b b b b 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main(args[0]);
	}

}
