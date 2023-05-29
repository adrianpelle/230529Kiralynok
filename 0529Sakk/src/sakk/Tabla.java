package sakk;

public class Tabla {
	
	private char[][] t;
	private char uresCella;
	
	
	public Tabla() {
		t = new char[8][8];
		uresCella = '#';
		
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[i].length; j++) {
				t[i][j]=uresCella;
			}
		}
	}
	
	
	public char[][] getT() {
		return t;
	}


	public void setT(char[][] t) {
		this.t = t;
	}


	public char getUresCella() {
		return uresCella;
	}


	public void setUresCella(char uresCella) {
		this.uresCella = uresCella;
	}



	
	

}
