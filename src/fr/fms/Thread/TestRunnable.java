package fr.fms.Thread;
/**
 * 
 * @author ChevinA
 *
 */
public class TestRunnable implements Runnable{
	private String[] symbols = {"!*!\n"
			+ "\"**\"\n"
			+ "#***#\n"
			+ "$****$\n"
			+ "%*****%\n"
			+ "&******&\n"
			+ "'*******'\n"
			+ "(********(\n"
			+ ")*********)\n"
			+ "************\n"};
	@Override
	public void run() {	
		for(int i = 0; i<symbols.length; i++) {
			System.out.print(symbols[i]);
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}

}
