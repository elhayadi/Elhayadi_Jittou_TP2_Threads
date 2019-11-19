package EX1;

public class Compte  implements Runnable { 

	Compte(){
		
	}
	private class ThreadA extends Thread {
        public void run() { 
        	try {
    			for(int i=1;i <= 2000;i++) {
    				System.out.print(i+ " ");
    				Thread.sleep(100);
    			}
    		}catch(InterruptedException e){
    			return;
    			
    		}
        }
    }
	private class ThreadB extends Thread {
        public void run() { 
        	try {
    			for(int i=2000;i >= 1;i--) {
    				System.out.print(i+ " ");
    				Thread.sleep(100);
    			}
    		}catch(InterruptedException e){
    			return;
    			
    		}
        }
    }
   
	public void run(){
		new ThreadA().start();
		new ThreadB().start();
	}
	/*public static void main(String[] args) {
		Runnable compte1 = new Compte();
		new Thread(compte1).start();

		}*/

}
