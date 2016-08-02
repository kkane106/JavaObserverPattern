package com.test;

public class TestObserver {
	public static void main(String[] args) {
		// create observers
		User anne = new User("anne@banan.com");
		User bob = new User("bob@dobbs.com");
		User carl = new User("hot@carl.com");
		
		// create observable
		Banana b = new Banana("Plantain");
		
		// subscribe observers to the observable
		b.addObserver(anne);
		b.addObserver(bob);
		b.addObserver(carl);
		
		// unsubscribe an observer from the observable
		bob.unsubscribe(b);
		
		// Changing the state of 'inStock' will call
		// 'update' on the list of Observers, sending
		// them notifications
		b.setInStock(true);
	}
}
