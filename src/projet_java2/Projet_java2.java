/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java2;
import java.util.*;


/**
 *
 * @author hecto
 */
public class Projet_java2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenue sur Les sims. Nous sommes dans Smallville, une belle ville mais elle abrite beaucoup de truants. Très attachés à leurs animaux, les sims sont de belles personnes qui veulent combattre la méchanceté et vivre en paix avec leurs boules de poils! A vous de jouer !\nVeuillez choisir le nom de votre personnage : ");
        Scanner scan_nom_hero = new Scanner(System.in);
        String nom_hero =scan_nom_hero.nextLine();
        System.out.println("Quel est votre metier ?");
        Scanner scan_metier_hero = new Scanner(System.in);
        String metier_hero =scan_metier_hero.nextLine();
        System.out.println("Quelle est votre position ?");
        Scanner scan_position_hero= new Scanner(System.in);
        String position_hero=scan_position_hero.nextLine();
        Humain hero = new Sims(nom_hero,position_hero,metier_hero);
        System.out.println("Maintenant, vous allez pouvoir choisir quel est votre animal de compagnie.\nVoulez-vous un Chat ou un Chien?");
        Scanner scan_type_animal= new Scanner(System.in);
        String type_animal= scan_type_animal.nextLine();
        type_animal=type_animal.toUpperCase();
        if ( type_animal.equals("CHAT")){
            
             System.out.println("Ton animal est un "+type_animal); 
             System.out.println("Maintenant tu vas pouvoir personnaliser ton chat!");
             System.out.println("Comment s'appelle ton chat ? ");
             Scanner scan_nom_animal= new Scanner(System.in);
             String nom_animal=scan_nom_animal.nextLine();
             System.out.println("De quelle couleur est ton chat ? ");
             Scanner scan_couleur_animal= new Scanner(System.in);
             String couleur_animal= scan_couleur_animal.nextLine();
             System.out.println("Où est ton chat ?");
             Scanner scan_lieu_animal= new Scanner(System.in);
             String lieu_animal= scan_lieu_animal.nextLine();
             Animal chat= new Chat(nom_animal,couleur_animal,lieu_animal);

        }
        if (type_animal.equals ("CHIEN")){
             System.out.println("Ton animal est un " +type_animal);
             System.out.println("Maintenant tu vas pouvoir personnaliser ton chien!");
             System.out.println("Comment s'appelle ton chien ? ");
             Scanner scan_nom_animal= new Scanner(System.in);
             String nom_animal=scan_nom_animal.nextLine();
             System.out.println("De quelle couleur est ton chien ? ");
             Scanner scan_couleur_animal= new Scanner(System.in);
             String couleur_animal= scan_couleur_animal.nextLine();
             System.out.println("Où est ton chien ?");
             Scanner scan_lieu_animal= new Scanner(System.in);
             String lieu_animal= scan_lieu_animal.nextLine();
             Animal chien= new Chien(nom_animal,couleur_animal,lieu_animal);
      
       }
        
    }
   
}