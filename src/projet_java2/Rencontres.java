package projet_java2;
/**
 * Décrivez votre classe Rencontres ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Rencontres extends Humain
{
    private String look;
    public Rencontres(String nom,String lieu,String metier)
    {
    super(nom,lieu,metier);
    }
    
    public void set_look(String look){
    this.look=look;
    }
    
    public void get_look(){
        System.out.println(this.quelesttonNom()+" ressemble a une "+this.look);
    }

    
}
