package projet_java2;

import java.util.Scanner;

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
    public boolean est_kidnappe=false;
    public boolean est_malade=false;
    
    public Animal(String nom, String couleur,String lieu){
        this.nom=nom;
        this.couleur=couleur;
        this.lieu=lieu;
    }
    public String quelestsonNom(){return this.nom;}
    public String quelestsacouleur(){return this.couleur;}
    
    public void tombemalade(){
        System.out.println("Ton animal est malade, attention il faudrait aller voir le veterinaire");
    }
    public void sedeplacer(String nouveau_lieu){
        this.lieu=nouveau_lieu;
        System.out.println("Vous allez en balade vers "+nouveau_lieu);
    }
     public void parler(String parle){
        System.out.println(nom+" : "+parle);
    }
     public void onlepresente(){ 
           System.out.println( "Ton animal s'appelle " + nom +", il est "+couleur+".");
    }
     
    public void se_fait_kidnapper(){
        this.est_kidnappe = true;
    }
    abstract void crier();
    
    public void est_il_kidnapper(Animal ton_animal){
        if (this.est_kidnappe==true){
            System.out.println("Ton animal est kidnappé");
    }
    }
    
}