package fr.fms.Flux;
/**
 * 3.1 Gestion des fichiers sur le tp resto
 * @author ChevinA
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestWriteMenus {
	public static void main(String[] args) throws IOException {
		int nbMenu = 0, num = 0; Scanner scan = new Scanner(System.in);
		String [] starters = 	{"salade","soupe","quiche","aucune"};
		String [] dishes = 		{"poulet" , "boeuf" , "poisson" , "végétarien" , "vegan","aucun"};
		String [] sideDishes = 	{"riz" , "pates" , "frites" , "légumes","aucun"};
		String [] drinks = 		{"eau plate" , "eau gazeuze" , "soda" , "vin","aucune"};
		String [] desserts = 	{"tarte maison" , "mousse au chocolat" , "tiramisu","aucun"};
		ArrayList<String>  order = new ArrayList<String>();		BufferedWriter menu = null; 
		//demander nombre de menus
		System.out.println("Bonjour et bienvenu, combien de menus souhaitez-vous ?" );
			while(scan.hasNextInt() == false)	scan.next();
				nbMenu = scan.nextInt();
			for(int i = 0; i < nbMenu; i++) {
				try {menu = new BufferedWriter (new FileWriter("order.txt",true));				
				//Affichage menu starters
				System.out.println("Commande numéro : "+(i+1)+ "\nLes entrées : ");
				displayMenu(starters);
				//demander choix
				System.out.println("\nQue souhaitez-vous comme entrée ? [Saisir le chiffre correspondant]");
				num = scan.nextInt();
				order.add(starters[num-1]);
				// affichage menu plats
				System.out.println("Les plats : ");
				displayMenu(dishes);
				//demander choix plat
				System.out.println("\nQue souhaitez-vous comme plat ? [Saisir le chiffre correspondant]");
				num= scan.nextInt();
				order.add(dishes[num-1]);
				// affichage menu accomp
				System.out.println("Les accompagnements : ");
				displayMenu(sideDishes);
				//demander choix accomp
				System.out.println("\nQue souhaitez-vous comme accompagnement ? [Saisir le chiffre correspondant]");
				num= scan.nextInt();
				order.add(sideDishes[num-1]);
				// affichage menu boissons
				System.out.println("Les boissons : ");
				displayMenu(drinks);
				//demander choix boissons
				System.out.println("\nQue souhaitez-vous comme boisson ? [Saisir le chiffre correspondant]");
				num= scan.nextInt();
				order.add(drinks[num-1]);
				// affichage menu desserts
				System.out.println("Les desserts : ");
				displayMenu(desserts);
				//demander choix desserts
				System.out.println("\nQue souhaitez-vous comme dessert ? [Saisir le chiffre correspondant]");
				num= scan.nextInt();				
				order.add(desserts[num-1]);
				System.out.println("Résumé de la commande : "+(i+1));
				System.out.println(order);		
			menu.write("*****************Résumé de la commande N°" +(i+1)+"*****************");
			for(String s : order) {
			menu.write("\n" +s);}
			menu.newLine();
			menu.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}order.clear();		
		}
		scan.close();
	}
/**
 * Méthode permettant d'afficher les différents éléments contenus dans le menu
 * @param table tableau de string
 */
	public static void displayMenu(String [] table) {
		for(int i = 0; i<table.length; i++) {
			System.out.println((i+1)+" - " +table[i].toUpperCase());
		}
	}

}
