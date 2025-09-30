package personnages;

public class Gaulois {
	private String nom;
	private String force;
	
	public Gaulois(String nom, String force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "le gaulois " + nom + " : ";
		
	}
	
	
}
