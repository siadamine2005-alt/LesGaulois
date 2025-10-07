package personnages;

public class Chaudron {
	private int quantitePotion = 0;
	private int force = 0;

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.force = forcePotion;
	}

	public int prendreLouche() {
		int forcelouche = force;
		quantitePotion--;
		if (!resterPotion()) {
			force = 0;
		}

		return forcelouche;
	}
}
