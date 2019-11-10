package projet_java2;
/**
 * Décrivez votre classe abstraite Animal ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Animal
{
    public String nom;
    public String couleur;
    public String lieu;
   
    public Animal(String nom, String couleur,String lieu){
        this.nom=nom;
        this.couleur=couleur;
        this.lieu=lieu;
        onlepresente();
        sedeplacer();
    }
    public String quelestsonNom(){return this.nom;}
    public String quelestsacouleur(){return this.couleur;}
    
    public void tombemalade(){
        System.out.println("Ton animal est malade, attention il faudrait aller voir le veterinaire");
    }
    public void sedeplacer(){
        System.out.println("Ton animal se déplace et va vers "+lieu);
    }
     public void parler(String parle){
        System.out.println(parle);
    }
     public void onlepresente(){ 
            parler( "Ton animal s'appelle " + nom +", il est "+couleur+".");
    }
}
