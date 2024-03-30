package monpackage;

public class UtilisationBanque {

	public static void main(String[] args) {


	        PorteFeuilleClients cb = new PorteFeuilleClients();
	       
	        int choix;

	        do {
	        	cb.menu();
	            choix = Saisie.lire_int("Choisissez une option : ");

	            switch (choix) {
	                case 1:
	                    cb.ajouterNComptes(3);
	                    System.out.println("Les trois comptes ont été créer !"+"");
	                    break;
	                case 2:
	                    cb.affichetout();
	                    break;
	                case 3:
	                    cb.afficherComptesNegatifs();
	                    break;
	                case 4:
	                    cb.DelAllAccount();
	                    break;
	                case 5:
	                    cb.testVide();
	                    break;
	                case 6:
	                    cb.AddNewAccount();
	                    System.out.println("Le compte à été créer !"+ "");
	                    break;
	                case 7:
	                	compte cbc = cb.searchById();
	                	if(cbc != null) {
	                	cb.sousmenu(cbc);
	                	break;
	                	}
	                	break;
	                case 8:
	                    System.out.println("Fin du programme."+ "");
	                    break;
	                default:
	                    System.out.println("Option invalide. Veuillez choisir une option valide."+ " *9");
	            }

	        } while (choix != 8);
	    }
	}
	
 

