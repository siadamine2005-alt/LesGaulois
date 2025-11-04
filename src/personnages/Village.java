package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] village;

	public Village(String nom, Gaulois chef, final int nbMaxVillageois) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.village = new Gaulois[nbMaxVillageois];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < village.length) {
			village[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		} else {
			System.out.println("Le village est plein.");
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (1 <= numVillageois && numVillageois <= nbVillageois) {
			return village[numVillageois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}

	public void afficherVillage() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + village[i]);
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix ", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);

		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();

		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);

		abraracourcix.sePrésenter();
		asterix.sePrésenter();
		doublepolemix.sePrésenter();
	}
}
