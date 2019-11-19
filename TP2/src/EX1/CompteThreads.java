package EX1;


public class CompteThreads extends Thread{
	int valeur;
	CompteThreads() {
		new ThreadB().start();
		  
	  }
	  public void run()
	  {
		  try {
  			for(int i=1;i <= 2000;i++) {
  				System.out.print(i+ "-");
  				Thread.sleep(1000);
  			}
  		}catch(InterruptedException e){
  			return;
  			
  		}
	  }
	  
		private class ThreadB extends Thread {
	        public void run() { 
	        	try {
	    			for(int i=2000;i >= 1;i--) {
	    				System.out.print(i+ "-");
	    				Thread.sleep(1000);
	    			}
	    		}catch(InterruptedException e){
	    			return;
	    			
	    		}
	        }
	    }
	  
	 

	  public static void main(String[] args) {
		  new CompteThreads().start();
		  
		  
	  }

}
