package com.test;

public interface Observer {
	public void update(Observable o);
	public void subscribe(Observable o);
	public void unsubscribe(Observable o);
}
