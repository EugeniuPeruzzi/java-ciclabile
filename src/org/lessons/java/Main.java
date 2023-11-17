package org.lessons.java;

public class Main {

	public static void main(String[] args) {
	    
		int[] numeri = {0, 1, 2, 3, 4, 5};

		CicloItero c1 = new CicloItero(numeri);
		
		while (c1.hasAncoraElementi()) {			
			System.out.println(c1.getElementoSuccessivo());
		}
	}

}
