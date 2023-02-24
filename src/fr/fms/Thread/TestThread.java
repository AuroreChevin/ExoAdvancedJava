package fr.fms.Thread;
/**
 * Exo 2.1 Test thread
 *Author ChevinA 
 *
 */

public class TestThread extends Thread{
/**
 * Constructeur prenant 1 paramètre
 * @param name type String
 */
	public TestThread(String name) {
		super(name);
	}
/**
* Méthode permettant l'affichage 
*/
	public void run() {
		for(int i =0; i < 5; i++)
			System.out.print(this.getName());
			System.out.println();
	}
	public static void main(String[] args) {
//		TestThread [] t = {new TestThread("1- "),new TestThread("2-- "),
//				new TestThread("3--- "),new TestThread("4---- "),new TestThread("5----- ")};
//		for(int i =0; i < 5; i++) {
//		t[i].start();
//		}	
		TestThread t = new TestThread("1- ");
		TestThread t2 = new TestThread("2-- ");
		TestThread t3 = new TestThread("3--- ");
		TestThread t4 = new TestThread("4---- ");
		TestThread t5 = new TestThread("5----- ");
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
