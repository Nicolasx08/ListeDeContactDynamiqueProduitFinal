package Attributs;

import java.util.Scanner;

/**
 * Created by PagNi1731620 on 2018-03-01.
 */
public class Telephone {
    private String type;
    private String numero;
    private String input;

    public String getType() {return type;}
    public String getNumero() {return numero;}

    public void setType(String type) {this.type = type;}
    public void setNumero(String numero) {this.numero = numero;}

    public static Telephone creerTel(){
        Scanner sc = new Scanner(System.in);
        Telephone nouveauTelephone = new Telephone();
        System.out.println("Téléphone");
        System.out.println("De quelle type de téléphone s'agit-il?");
        nouveauTelephone.setType(sc.next());
        System.out.println("Quelle est votre numéro?");
        nouveauTelephone.setNumero(sc.next());
        return nouveauTelephone;
    }
    public void modifierTel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Téléphone");
    System.out.println("Type: "+type);
    input=sc.nextLine().trim();
    if (!input.equals("")){
        setType(input);
    }
    System.out.println("numero: "+numero);
    input=sc.nextLine().trim();
    if (!input.equals("")){
        setNumero(input);
    }
    }
    public void afficherTel(){
        System.out.println("Téléphone: ");
        System.out.println("Type: "+type);
        System.out.println("Numéro: "+ numero);
    }
}

