package EX3;

public class Valeur {
	int Val;

	public Valeur(int vleur) {
	
		this.Val = vleur;
	}

	public int getVal() {
		return Val;
	}
	public void add(int i) {
		Val=Val+i;
	}
	
	public String toString() {
		return "Valeur [Val=" + Val + "]";
	}

	
	
}
