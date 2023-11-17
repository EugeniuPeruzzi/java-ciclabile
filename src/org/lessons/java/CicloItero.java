package org.lessons.java;

public class CicloItero {
	private int[] numeri;
	private int indice;
	
	public CicloItero(int[] numeri) {
		setNumeri(numeri);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numeri: ");
        for (int numero : numeri) {
            sb.append(numero + " ");
        }
        sb.append("\nIndice: " + indice);
        return sb.toString();
    }
    
}
