package monpackage;

public class compte {
	 private String Titulaire;
	 private int Num;
	 private double Solde;
	 private double Decouvert;
	
	public compte(String Titulaires, int Nums, double Soldes, double Decouverts) 
	{
		Titulaire=  Titulaires;
		Num= Nums;
		Solde= Soldes;
		Decouvert= Decouverts;
	}
	
	public void Consulter () {
		System.out.println("Le solde de votre compte est de " +Solde+ "euros");
	} 
	
	public void Depot (double Somme) {
		Solde = Solde +Somme;
	}
	
	public void Retrait (double Somme){
		if ((Solde -Somme)< Decouvert){
			System.out.println("Retrait impossible");
		}else {
			Solde= Solde-Somme;
		}
	}
	
	public void AfficheCompte()
	{
	       System.out.println("Client : " + Titulaire);
	       System.out.println("Numero de compte : " + Num);
	       System.out.println("Soldes : " + Solde + " Euro(s)");
	       System.out.println("Decouvert : " + Decouvert + " Euro(s)");
	}

	public double getSolde() {
		return Solde;
	}

	public double getNum() {
		return Num;
	}

	public void setDecouvert(double nouveauDecouvert) {
		Decouvert = nouveauDecouvert;
	}

	public String getTitulaire() {
		return Titulaire;
	}

}
