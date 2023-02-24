package fr.fms.Thread;
/**
 * 2.2 Modification de la classe TestRunnable
 * @author ChevinA
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {    
    Thread thread = new Thread(new MonRunnable(1000));  
    thread.start();
  }

  private static class MonRunnable implements Runnable {
	private DateFormat df = new SimpleDateFormat("HH:mm:ss");
    private long delai;
    public MonRunnable(long delai) {
      this.delai = delai;
    }
    @Override
    public void run() {
    	while(true) {System.out.println(df.format(new Date()));
	      try {
	        Thread.sleep(delai);
	        
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}
