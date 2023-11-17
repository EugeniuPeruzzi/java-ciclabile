package org.lessons.java;

public class CicloItero {
	private int[] numeri;
	private int indice;
	
	public CicloItero(int[] numeri) {
		setNumeri(numeri);
		setIndice(indice);
	}
	
	public CicloItero() {
	setNumeri(new int[0]);
	setIndice(indice);
}

	public int[] getNumeri() {
		return numeri;
	}

	public void setNumeri(int[] numeri) {
		this.numeri = numeri;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
    public int getElementoSuccessivo() {
        int[] elemento = getNumeri();
        setIndice(indice + 1);
        return elemento[getIndice() - 1];
    }

    public boolean hasAncoraElementi() {
        return getIndice() < getNumeri().length;
    }
    
    public void addElemento(int nuovoElemento) {
        // Crea un nuovo array che è più grande di un elemento
        int[] nuovoNumeri = new int[getNumeri().length + 1 ];
        // Copia gli elementi dal vecchio array al nuovo array
        System.arraycopy(getNumeri(), 0, nuovoNumeri, 0, getNumeri().length);
        // Aggiunge il nuovo elemento alla fine del nuovo array
        nuovoNumeri[getNumeri().length] = nuovoElemento;
        // Imposta l'array sul nuovo array.
        setNumeri(nuovoNumeri);
    }

}
