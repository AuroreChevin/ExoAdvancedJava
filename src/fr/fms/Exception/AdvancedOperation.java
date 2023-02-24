package fr.fms.Exception;
/**
 * 1.2 Exercice précédent repris afin d'ajouter exception.
 * @author ChevinA
 *
 */
public class AdvancedOperation {
	public static double add (double a, double b) {
		return a + b;
		}
	public static double sub (double a, double b) {
		return a - b;		 
	}
	public static double div (double a, double b) throws ArithmeticException {
		double quo = 0;
		if(b == 0)
			throw new ArithmeticException ("le dénominateur ne peut pas être 0");
		else
			quo = a/b;
		return quo;
	}
	public static void main(String[] args) {
		try {
			System.out.print("3/0 : ");
			System.out.println(div(3,0));
		}
		catch(java.lang.ArithmeticException ae) {
			System.out.println("Exception arythmétique : " +ae.getMessage());			
		}
		finally {
			System.out.println(add(5,2));
			System.out.println(sub(5,2));
		}		
	}
}
