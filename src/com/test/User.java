package com.test;

public class User extends Person {
	
	public User(String email) {
		super(email);
	}
	
	@Override
	public void update(Observable o) {
		System.out.println(this.getEmail());
		try {
			purchaseSubscribedInventory(o);			
		} catch (ClassCastException cce) {
			cce.printStackTrace();
		}
	}
	
	@Override
	public void subscribe(Observable o) {
		o.addObserver(this);
	}
	
	public void purchaseSubscribedInventory(Observable o) {
		if (o instanceof Inventory) {
			Inventory i = (Inventory) o;
			System.out.println("Purchased " + i.getName());
		} else {
			throw new ClassCastException("Observable must be of type Inventory");
		}
	}

	@Override
	public void unsubscribe(Observable o) {
		o.removeObserver(this);
	}
}
