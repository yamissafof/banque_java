package monpackage;

import java.util.ArrayList;
import java.util.ListIterator;


public class PorteFeuilleClients {
	private ArrayList<compte> CompteClients;
	private int nbr = 0;

	public PorteFeuilleClients(){
		CompteClients = new ArrayList<compte>();
	}

	public void menu() {
	    
	    System.out.println("                 MENU PRINCIPAL               ");
	    System.out.println("1. Ajouter 3 comptes"+"                         ");
	    System.out.println("2. Afficher tous les comptes"+"                 ");  
	    System.out.println("3. Afficher les comptes avec solde négatif"+"   ");
	    System.out.println("4. Supprimer tous les comptes"+"                ");
	    System.out.println("5. Tester si la liste est vide"+"               "); 
	    System.out.println("6. Créer un compte"+"                           "); 
	    System.out.println("7. Rechercher un client par numéro"+"           "); 
	    System.out.println("8. Quitter l'application"+"                     "); 
	}
	
	public void sousmenu(compte cbc) {
		ListIterator<compte> it = CompteClients.listIterator();
        
        if (it.hasNext()) {
            compte compte = it.next();
            int choixSousMenu;

            do {
                 System.out.println("               SOUS-MENU                ");
                 System.out.println("           Bienvenue " + cbc.getTitulaire()+"");		
                 System.out.println("1. Afficher le Solde"+"                   ");
                 System.out.println("2. Modifier le découvert"+"               ");
                 System.out.println("3. Supprimer le compte"+"                 ");
                 System.out.println("4. Retour"+"                              ");
                choixSousMenu = Saisie.lire_int("Choisissez une option : ");

                switch (choixSousMenu) {
                    case 1:
                    	System.out.println("Solde du compte : " + "                     ");
                    	cbc.Consulter();
                        break;
                    case 2:
                        double nouveauDecouvert = Saisie.lire_double("Entrez le nouveau decouvert : ");
                        cbc.setDecouvert(nouveauDecouvert);
                        System.out.println("Decouvert modifié avec succès." + "");
                        break;
                    case 3:
                    	
                    	while (it.hasNext()) {
                            compte compte1 = it.next();
                            if (compte1 == cbc) {
                                it.remove(); // Supprimer le compte actuel
                        System.out.println("Compte supprimé avec succès."+ "");
                        return;
                        }
                            }
                    case 4:
                        System.out.println("Retour au menu principal."+ "");
                        break;
            
                    default:
                        System.out.println("Option invalide. Veuillez choisir une option valide."+ "");
                }

            } while (choixSousMenu != 4);
        } else {
            System.out.println("Aucun compte trouvé."+ "");
        }
    }


	public void ajouterNComptes(int nb) {
	        for (int i = 0; i < nb; i++) {
	        	int Num = nbr++;
	            String Titulaire = "Client " + Num;
	            double Solde = 1000 + (Num) * 100;
	            double Decouvert = 500;
 
	            compte cmpt = new compte(Titulaire, Num, Solde, Decouvert);
	            CompteClients.add(cmpt);
	        }
	    }
	
	public void AddNewAccount() {
        	int Num = nbr++;
            String Titulaire = Saisie.lire_String("Quelle est votre nom ?");
            double Solde = Saisie.lire_double("Quel est le montant de votre solde ?");
            double Decouvert = Saisie.lire_double("Quel est le montant maximum de votre decouvert ?");

            compte cmpt = new compte(Titulaire, Num, Solde, Decouvert);
            CompteClients.add(cmpt);
            cmpt.AfficheCompte();
        }
    

	public void affichetout() {
		System.out.println("Voici les comptes : "+ "");
		ListIterator<compte> it = CompteClients.listIterator();
		while(it.hasNext()) {
			Object Obj = it.next();
			compte cmpt = (compte) Obj;
			cmpt.AfficheCompte();
		}
	}

	
	public void DelAllAccount() {
		System.out.println("Voulez-vous supprimer tous les comptes ? | 1 = Oui, 2 = Non"+ "");
	    int choix = Saisie.lire_int("");
	   
	    if (choix == 1) {
	        CompteClients.clear(); // Supprime tous les éléments de la liste
	        System.out.println("Tous les comptes ont été supprimés."+ "");
	    } else if (choix == 2) {
	        System.out.println("Operation annulée. Voici les comptes restants :"+ "");
	        ListIterator<compte> it = CompteClients.listIterator();
	        while (it.hasNext()) {
	            compte cmpt = it.next();
	            cmpt.AfficheCompte();
	        }
	    } else {
	        System.out.println("Choix invalide. Aucune action effectuée.");
	    }
	}
	
	
	public void testVide() {
		if(CompteClients.isEmpty()){
			System.out.println("La liste est vide !" + "");
		}else {
			System.out.println("La liste n'est pas vide !"+ "");
		}
	}
	
	public void afficherComptesNegatifs() {
        System.out.println("Comptes avec solde négatif : "+ "");
        ListIterator<compte> it = CompteClients.listIterator();
        if(CompteClients.isEmpty()){
       }else {

       }
        
        while (it.hasNext()) {
            compte compte = it.next();
            if (compte.getSolde() < 0) {
                compte.AfficheCompte();
            } 
        }
    }
	
	public compte searchById() {
		System.out.println("Veuillez choisir le code client : "+"");
		int Num1 = Saisie.lire_int("");
	ListIterator<compte> it = CompteClients.listIterator();
	while (it.hasNext()) {
        compte compte = it.next();
        if (compte.getNum() == Num1) {
            return compte;
        } 
    }
	System.out.println("Aucun compte trouvé avec le numéro : " + Num1+ "");
	return null;
}
	
}
	
