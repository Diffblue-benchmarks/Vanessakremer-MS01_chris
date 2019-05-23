package map;

public class Field{

	private char gebaeudeart;
	private int geschwindigkeit;
	private boolean richtungnord;
	private boolean richtungost;
	private boolean richtungsud;
	private boolean richtungwest

	public void richtung(Field[][] map) {
		

	}

	public Field() {
		this.gebaeudeart = 'L';
		this.geschwindigkeit = 0;
		
	}

	public Field(char art, int geschwindigkeit, boolean richtungnord, boolean richtungost, boolean richtungsud,
			boolean richtungwest) {
		this.gebaeudeart = art;
		this.geschwindigkeit = geschwindigkeit;
		this.richtungnord = richtungnord;
		this.richtungost = richtungost;
		this.richtungsud = richtungsud;
		this.richtungwest = richtungwest;

	}
	
	public String toString() {
		return this.gebaeudeart + Integer.toString(this.geschwindigkeit);
//				+ " "
//				+ this.richtung;
	}

	public char getGebaeudeart() {
		return gebaeudeart;
	}
	public void setGebaeudeart(char gebaeudeart) {
		this.gebaeudeart = gebaeudeart;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}


	public boolean isRichtungnord() {
		return richtungnord;
	}
	public void setRichtungnord(boolean richtungnord) {
		this.richtungnord = richtungnord;
	}
	
	public boolean isRichtungost() {
		return richtungost;
	}
	public void setRichtungost(boolean richtungost) {
		this.richtungost = richtungost;
	}

	public boolean isRichtungsud() {
		return richtungsud;
	}
	public void setRichtungsud(boolean richtungsud) {
		this.richtungsud = richtungsud;
	}

	public boolean isRichtungwest() {
		return richtungwest;
	}
	public void setRichtungwest(boolean richtungwest) {
		this.richtungwest = richtungwest;
	}

}
