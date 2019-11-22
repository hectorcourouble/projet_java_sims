package projet_java2;
/**
 * Décrivez votre classe Femme ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Femme extends Rencontres implements Gentille
{
   
    public Femme(String nom,String lieu,String metier)
    {
    super(nom,lieu,metier);
    
    }
    public void carresser_animal(Animal ton_animal){
    System.out.println(this.quelesttonNom()+" carresse ton animal");
    ton_animal.crier();
    
    };
    

}
