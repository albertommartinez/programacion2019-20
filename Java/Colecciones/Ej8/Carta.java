package ej8;

class Carta {
	palos palo;
	figuras figura;
	
	Carta(palos palo,figuras figura) {
		this.setPalo(palo);
		this.setFigura(figura);
	}

	//Getters & Setters
	public palos getPalo() {
		return palo;
	}

	public void setPalo(palos palo) {
		this.palo = palo;
	}

	public figuras getFigura() {
		return figura;
	}

	public void setFigura(figuras figura) {
		this.figura = figura;
	}

	@Override
	public String toString() {
		return this.figura+" de "+this.palo;
	}
	
	
}
