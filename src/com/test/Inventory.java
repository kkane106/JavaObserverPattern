package com.test;

import java.util.ArrayList;
import java.util.List;

public abstract class Inventory implements Observable {
	private boolean inStock;
	private List<Observer> users;
	private String name;
	
	public Inventory () {
		this("");
	}
	
	public Inventory (String name) {
		this.name = name;
		this.users = new ArrayList<>();
	}
	
	public boolean getInStock() {
		return this.inStock;
	}
	
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		notifyObserver();
	}
	
	public List<Observer> getUsers() {
		return users;
	}

	public void setUsers(List<Observer> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void addObserver(Observer o) {
		users.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		users.remove(o);
	}
	
	@Override
	public void notifyObserver() {
		for (Observer observer : users) {
			observer.update(this);
		}
	}
}
