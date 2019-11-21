package projet_java2;
import java.util.Scanner;

/**
 * Décrivez votre classe Chien ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Chien extends Animal
{
    public Chien(String nom,String couleur,String lieu)
    {
    super(nom,couleur,lieu);
    System.out.println("Ton animal est un chien");
             System.out.println("Maintenant tu vas pouvoir personnaliser ton chien!");
             System.out.println("Comment s'appelle ton chien ? ");
             Scanner scan_nom_animal= new Scanner(System.in);
             String nom_animal=scan_nom_animal.nextLine();
             System.out.println("De quelle couleur est ton chien ? ");
             Scanner scan_couleur_animal= new Scanner(System.in);
             String couleur_animal= scan_couleur_animal.nextLine();
             this.nom=nom_animal;
             this.couleur=couleur_animal;
    }
    public void crier(){
        parler("Ouaf ouaf !");
    } 
    
}    