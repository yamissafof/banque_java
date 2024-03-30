package monpackage;


public class Compte_Epargne extends CompteSeconde{

	private float taux;
	
	public Compte_Epargne(int no, String nm, int s, float tauxSaisie) {
		super(no, nm, s);
		this.taux = tauxSaisie;
	}
	
	protected void mise_a_jour() {
		this.taux *= 0.05;
	}
	
	
	protected void consulte() {
		//System.out.print("Nom : " + this.nom + " | Numero : " + this.numero + " | Solde : " + this.solde + " | Taux : " + this.taux + "\n");
		super.consulterLeCompte();
		System.out.println("Le taux de remuneration est de " + taux + "%");
	}

}
