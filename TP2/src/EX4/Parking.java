package EX4;

public class Parking {
   int place;
   
   public class voiture extends Thread{
	   int id;

	public voiture(int id) {
		this.id = id;
	} 
	
	   
   }
   
   public boolean entre(String entree){
	   boolean i =false;
	   if(entree=="accept")
	   i=true;
	   else if(entree=="refus")
		  i=false;
	   return i;
		   
   }
   
   
   public void sortie() {
	   System.out.print("Voiture sortie");
   }
   
}
