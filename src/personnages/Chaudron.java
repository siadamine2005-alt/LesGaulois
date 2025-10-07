package personnages;

public class Chaudron {
	private int quantitePotion;
	private int force;
	
	public Chaudron(int quantitePotion, int force) {
		this.quantitePotion = quantitePotion;
		this.force = force;
	}

	public boolean resterPotion() {
		return quantitePotion != 0;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.force = forcePotion;
	}
	
	public int prendreLouche() {
		quantitePotion--;
		if (! resterPotion()) {
			force=0;
		}
		return force;
	}
}
