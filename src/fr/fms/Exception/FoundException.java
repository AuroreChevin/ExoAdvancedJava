package fr.fms.Exception;
import java.util.Date;
/**
 * Exo 1.1 Programme présentant des problèmes, il faut trouver des moyens permettant l'affichage des instruction.
 *La méthode getClass() vient de la classe Object.
 * @author ChevinA
 *
 */
public class FoundException {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		Date[] dt = {date, today};
		for(int i = 0; i <dt.length;i++){
		try {
		System.out.println(dt[i].getClass().getName());		
		}
		catch(java.lang.NullPointerException e){
			System.out.println(e);
		}
		}
		
	}

}
