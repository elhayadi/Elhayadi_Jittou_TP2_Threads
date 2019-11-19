package EX3;

import EX2.TestOrder;

public class Test {
	public static void main(String[] args) {
		
		Valeur myVal = new Valeur(2);
		Ajob job1 = new Ajob(myVal,1);
		Ajob job2 = new Ajob(myVal,-1);
		new Thread(job1).start();
		new Thread(job2).start();
	  System.out.print(myVal.toString());
		}
	
}
