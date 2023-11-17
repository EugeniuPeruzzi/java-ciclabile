package org.lessons.java;

public class Main {

	public static void main(String[] args) {
	    
		int[] numeri = {0, 1, 2, 3, 4, 5};

		CicloItero c1 = new CicloItero(numeri);
		
		while (c1.hasAncoraElementi()) {			
			System.out.println(c1.getElementoSuccessivo());
		}
		
		System.out.println("___________________________\n");
		
		CicloItero c2 = new CicloItero();
		c2.addElemento(6);
		c2.addElemento(7);
		c2.addElemento(8);
		c2.addElemento(10);
		c2.addElemento(24);
		c2.addElemento(53);
		
		while (c2.hasAncoraElementi()) {			
		    System.out.println(c2.getElementoSuccessivo());
		}
	}

}
