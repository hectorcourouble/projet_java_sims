package projet_java2;
/**
 * Décrivez votre classe bimbo ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Bimbo extends Rencontres implements Mechant
{
    public boolean animalvole = false;
    public boolean estenprison = false;
    public Bimbo(String nom,String lieu,String metier)
    {
    super(nom,lieu,metier);       
    }
    
     public void kidnapper_animal(Animal ton_animal){
        System.out.println("la bimbo a kidnappe votre chien");
        ton_animal.se_fait_kidnapper();
        this.animalvole=true;
     }
}
