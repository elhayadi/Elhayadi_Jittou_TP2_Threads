package EX2;

public class TestOrder extends Thread{
	int N;
	String name;
	TestOrder(String nom,int nbr){
		N=nbr;
		name =nom;
	}
	public void run(){
		 double Time =  Math.random()*10;
		  
		 try {
			
		 for(;;) {System.out.print(Time+"---------------------------------------------");
			  new Compteur(name, N).start();
			  Thread.sleep((int)Time);
		 }
			
		} catch (InterruptedException e) {
			return;
		}
	}
	
	public static void main(String[] args) {
		new TestOrder("Asmaa",3).start();
		
	
		}
	}
