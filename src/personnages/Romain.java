package personnages;

import Objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isInvariantVerified();
		int forceAvant = force;
		this.force -= forceCoup;
		if (force < 1) {
			parler("J'abondonne !");
		} else {
			parler("Aie");
		}
		assert forceAvant > force;
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	private String soldatNom(String nom) {
		return "Le soldat " + nom + " ";
	}
	
	private void equiperSoldat(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		System.out.println(soldatNom(nom) + "s’équipe avec un " + equipement + ".");
		nbEquipement++;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println(soldatNom(nom)+"est déjà bien protégé !");
			break;

		case 1:
			if (equipements[0] == equipement) {
				System.out.println(soldatNom(nom) + "possède déjà un " + equipement + " !");
			} else {
				equiperSoldat(equipement);
			}
			break;
		case 0:
			equiperSoldat(equipement);
			break;
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		assert minus.isInvariantVerified();
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
}

