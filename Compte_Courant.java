package monpackage;


public class Compte_Courant extends CompteSeconde {

	private int decouvert_autorise;
	
	public Compte_Courant(int no, String nm, int s, int decouvertAutoriseSaisie) {
		super(no, nm, s);
		this.decouvert_autorise = decouvertAutoriseSaisie;
	}
	
	public void consulte() {
		//System.out.print("Nom : " + this.nom + " | Numero : " + this.numero + " | Solde : " + this.solde + " | Decouvert : " + this.decouvert_autorise + "\n");
		super.consulterLeCompte();
		System.out.println("Decouvert : " + decouvert_autorise);
	}
	
	public void retirer(int val) {
		
		/*if(super.solde - val < decouvert_autorise)
        {
            System.out.println("Operation annulee. Mr " + nom + ",  vous avez depasse le decouvert autorisé de votre compte.");
        }
        else 
        {
            System.out.println("Operation reussie. Mr " + nom + ", vous avez bel et bien retire l'argent.");
            solde -= val;
        }*/
		super.retirer(val);
	}
	

}
