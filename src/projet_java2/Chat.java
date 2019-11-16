package projet_java2;

import java.util.Scanner;

/**
 * Décrivez votre classe Chat ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Chat extends Animal
{

    public Chat(String nom,String couleur,String lieu)
    {
    super(nom,couleur,lieu);
    System.out.println("Ton animal est un chat"); 
             System.out.println("Maintenant tu vas pouvoir personnaliser ton chat!");
             System.out.println("Comment s'appelle ton chat ? ");
             Scanner scan_nom_animal= new Scanner(System.in);
             String nom_animal=scan_nom_animal.nextLine();
             System.out.println("De quelle couleur est ton chat ? ");
             Scanner scan_couleur_animal= new Scanner(System.in);
             String couleur_animal= scan_couleur_animal.nextLine();
             System.out.println("Où est ton chat ?");
             Scanner scan_lieu_animal= new Scanner(System.in);
             String lieu_animal= scan_lieu_animal.nextLine();
             this.nom=nom_animal;
             this.couleur=couleur_animal;
             this.lieu=lieu_animal;
             onlepresente();
             
    }
    
    public void crier(){
        parler("Miaaouuu");
    } 
      
 } 
