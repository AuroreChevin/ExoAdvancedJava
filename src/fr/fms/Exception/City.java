package fr.fms.Exception;
 
/**La classe City représente une ville avec différents attributs : 
  * 	nom de la ville
  * 	pays
  * 	nombre d'habitants
  * Cette classe contient également constructeurs et accesseurs.
  * Ajout d'exceptions
  * @author ChevinA 2023
  * /**La classe TestCity contient la méthode main qui permettra de tester la classe City
 * 
 * @author ChevinA
 * @since 1.0
 * @version 1.0
 */
public class City{
	private static int instanceCounter = 0;
	// 1 Définir les attributs de l'objet:   
//	public String nameOfCity;	
//	public String country;		
//	public int nbInhabitants;	
	private String nameOfCity;	
	private String country;		
	private int nbInhabitants;
	public static final int MIN_NBINHABITANTS = 450000;
	
	// 2 définir au moins un constructeur qui sera appellé dans main en invoquant opérateur "new"
	public City(String nameOfCity, String country, int nbInhabitants){		
		this.nbInhabitants = nbInhabitants;
		this.nameOfCity = nameOfCity;
		this.country = country;
		instanceCounter++;		
			
	}
	public City(String nameOfCity, int nbInhabitants) {
		this.nameOfCity = nameOfCity;
		this.country = "inconnu";
		
		this.nbInhabitants = nbInhabitants;
		instanceCounter++;
	}
	public City(String nameOfCity, String country) {
		setNameOfCity(nameOfCity);
		setCountry(country);
		
		instanceCounter++;
	}
	
	public String getNameOfCity() {
		return nameOfCity;
	}
	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {		
		this.country = country;
	}
	public int getNbInhabitants() {
		return nbInhabitants;
	}
	/**
	 * Méthode setnbInhabitants() permet de génerer une erreur en cas de changement 
	 * de l'attribut nbInhabitants en entier négatif.
	 */
	public void setNbInhabitants(int nbInhabitants) throws RuntimeException, Exception{
		if(nbInhabitants < 0) {
			throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif !");		
			}
		this.nbInhabitants = nbInhabitants;
		if(nbInhabitants >0 && nbInhabitants < MIN_NBINHABITANTS) {
			throw new Exception("Le nombre d'habitants ne correspond pas");}
			this.nbInhabitants = nbInhabitants;
	}
	public static int getInstanceCounter() {
		return instanceCounter++;
	}
	/**
	 * Méthode displayCity() permet l'affichage de tous les attributs d'une ville.
	 */
	public void displayCity() {
		System.out.println("[Ville : " + this.nameOfCity+ "] [Pays : " +this.country+
							"] [Nombre d'habitants : "+this.nbInhabitants+"]");
	}
	/**
	 * Méthode display() permet l'affichage de tous les attributs d'une ville,
	 * 
	 */
	public void display() {
		System.out.println("La ville de "+this.nameOfCity+ " en " +this.country+
				" compte " +this.nbInhabitants+ " habitants");
	}
	/**
	 * Méthode toString redéfinie
	 */
//	1.6
//	@Override
//	public String toString() {
//		return "La ville de " +getNameOfCity()+ " en "+getCountry()+ " compte "+getNbInhabitants()+" habitants";
//	}
	@Override
	public String toString() {
		if(getNbInhabitants()==0) {
			return getNameOfCity()+", "+getCountry();
		}
//		return "Ville : " +getNameOfCity()+", "+getCountry()+", "+getNbInhabitants()+ " habitants";
		return "Ville : " +getNameOfCity()+", "+getCountry()+" ";
	}
}
