import Attributs.*;

import java.util.*;


public class ListeDeContactDynamique {
 public static void main(String[] args) {
     boolean ok = false;
     int decision = 0;
     boolean quitter = false;
     HashMap<String, Contact> map = new HashMap<>();
     List<Telephone> listeTel = new ArrayList<>();
     Queue<Contact> listeRappel=new LinkedList<>();
     String choix = "l";
     char autreNuméro = 'k';
     boolean autreNum = true;
     boolean listePasFini = false;
     Scanner sc = new Scanner(System.in);

     while (!listePasFini) {
         quitter=false;
         while (!quitter) {
             System.out.println("1-Ajouter un contact.");
             System.out.println("2-Modifier un contact.");
             System.out.println("3-Afficher un contact.");
             System.out.println("4-Supprimer un contact.");
             System.out.println("5-Ajouter un contact à la liste de rappel.");
             System.out.println("6-Voir la liste de rappel.");
             System.out.println("7- Quitter");
             decision = sc.nextInt();
             if (decision <= 7 && decision >= 1) {
                 quitter = true;
             } else {
                 System.out.println("Entrez une réponse valide.");
             }
         }
         switch (decision) {
             case 1:
                 Contact contact = Contact.creerContact();
                 map.put(contact.getNom(), contact);
                 break;
             case 2:

                 System.out.println("Quel est le prénom du contact que vous voulez modifier?");
                 choix=sc.next();
                 if(map.get(choix)!=null) {
                     map.get(choix).modifierContact();
                 }
                 else  if (!choix.equals(map.get(choix).getNom())){
                     map.put(map.get(choix).getNom(),map.get(choix));
                     map.remove(choix);
                 }

                 else{
                     System.out.println("Le contact n'existe pas!");
                 }
                 break;
             case 3:
                 map.forEach((k,contact2)->{
                     contact2.afficherContact();
             });
                 break;
             case 4:  System.out.println("Quel est le prenom du contact ?");
                 choix=sc.next();
                 if(map.get(choix)!=null) {
                     map.remove(choix);
                 }
                 else{
                     System.out.println("Le contact n'existe pas");
                 }
                 break;
             case 5:
                 System.out.println("Quel est le prénom du contact?");
                 choix=sc.next();
                 if (map.get(choix)!=null){
                     listeRappel.add(map.get(choix));
                 }
                 else {
                     System.out.println("Le contact n'existe pas.");
                 }
                 break;
             case 6: if(listeRappel.peek()!=null){
                 System.out.println("Le contact a rappelé au plus tôt est "+listeRappel.peek().getNom()+" "+listeRappel.poll().getNomDeFamille());
             }
             else{
                 System.out.println("Il n'y a aucun contact à rappeler");
             }
                 break;
             case 7: System.out.println("Bye!Bye!");
             System.exit(0);
             break;

         }
     }
    }

 }