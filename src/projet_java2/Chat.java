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
    set_nom(nom_animal);
    set_couleur(couleur_animal);
              
    }
    
    public void crier(){
        parler("Miaaouuu");
    } 
      
 } 
