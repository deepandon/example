package org.constructor;

public class child extends parent {
	@Override
	public void morning() {
	System.out.println("poori");
		
	}
	public static void main(String[] args) {
		parent a = new child();
		a.morning();
	}

}
