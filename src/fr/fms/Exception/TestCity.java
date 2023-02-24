package fr.fms.Exception;
import java.util.Scanner;
/**
 *  1.2 Exercice repris afin d'ajouter des exceptions.
 * 
 * @author ChevinA 2023
 * @since 1.0
 * @version 1.0
 */
public class TestCity {
	public static City toulouse = new City("Toulouse", "France", 450000);
	public static City lille = new City("Lille", "France", 232741);
	public static City kyoto = new City("Kyoto", "Japon", 1475000);
	public static City hull = new City("Hull", 261149);
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int data = 0;

		while(data<=0 || data <450000) {
			System.out.println("Donnez moi le nombre d'habitants de Toulouse");
			data = scan.nextInt();
			try {
				toulouse.setNbInhabitants(data);
			}
			catch (RuntimeException re) {
				re.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		toulouse.displayCity();
	}

}
