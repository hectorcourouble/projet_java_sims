package projet_java2;
/**
 * Décrivez votre classe abstraite Humain ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Humain
{
    // variable d'instance - remplacez cet exemple par le vôtre
    private String nom;
    private String lieu;
    private String metier;
    
    public Humain(String nom, String lieu, String metier){
        this.nom = nom;
        this.metier=metier;
        sepresenter();
        this.lieu = lieu;
        jesuisal();
        
    }
    public String Monmetierest(){return this.metier;}
    
    public String quelesttonNom(){return this.nom;}
    
    public void sedeplacer(String nouveau_lieu){
        this.lieu=nouveau_lieu;
    }
        
    public void parler(String parle){
        System.out.println(nom+" : "+parle);
    }
    public void sepresenter(){
        parler("Salut, je m'appelle " + nom +", je suis "+metier+".");
    }
    public void jesuisal(){
        parler("Je suis à "+ lieu + ".");
    }


}
