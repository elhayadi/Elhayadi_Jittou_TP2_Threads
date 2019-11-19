package EX3;

public class Ajob implements Runnable{
	Valeur myVal;
	int nbr;
	
	
	public Ajob(Valeur myVal, int i) {
		this.myVal = myVal;
		this.nbr = i;
	}
	public void run() {
		int limit = 10^6;
		for(int i=0;i<limit;i++) {
			myVal.add(nbr);
		}
	}
	
}
