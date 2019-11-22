package projet_java2;
/**
 * Décrivez votre classe sims ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Sims extends Humain implements Gentille
{
    
    public Sims(String nom,String lieu,String metier)
    {
    super(nom,lieu,metier);
    
    }
    public void carresser_animal(Animal ton_animal){
    System.out.println("tu carresses ton animal");
    ton_animal.crier();
    
    };
}
