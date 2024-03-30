package monpackage;


public class CompteSeconde{
	
	protected int numero;
	protected String nom_titulaire;
	protected int solde;
	
	public CompteSeconde(int no, String nm, int s) {
		this.numero = no;
		this.nom_titulaire = nm;
		this.solde = s;
	}
	
	public void consulterLeCompte() {
    	System.out.print("Nom : " + nom_titulaire + " | Numero : " + numero + " | Solde : " + solde + "\n");
	}
	
	public void deposer(int val) {
		this.solde = solde + val;
	}
	
	public void retirer(int val) {
		this.solde = solde - val;
	}
	
}
