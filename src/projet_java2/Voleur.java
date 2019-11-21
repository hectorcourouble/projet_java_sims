package projet_java2;
/**
 * Décrivez votre classe voleur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Voleur extends Humain implements Mechant
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public boolean animalvole = false;
    public boolean estenprison = false;

    public Voleur(String nom,String lieu,String metier){
    super(nom,lieu,metier);
    }
    
    public void kidnapper_animal(Animal ton_animal){
        System.out.println("le voleur a kidnappe votre chien");
        ton_animal.se_fait_kidnapper();
        this.animalvole=true;
        
    }
}
