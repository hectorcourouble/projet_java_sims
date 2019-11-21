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
        //System.out.println("Quelle est votre position ?");
        //Scanner scan_position_hero= new Scanner(System.in);
        //String position_hero=scan_position_hero.nextLine();
        Sims hero = new Sims(nom_hero,"maison",metier_hero);
        System.out.println("Maintenant, vous allez pouvoir choisir quel est votre animal de compagnie.\nVoulez-vous un Chat ou un Chien?");
        Scanner scan_type_animal= new Scanner(System.in);
        String type_animal= scan_type_animal.nextLine();
        type_animal=type_animal.toUpperCase();
        Animal ton_animal = null;
        //while (type_animal!="CHAT" || type_animal!="CHIEN"){
        //System.out.println("votre saisie n'est pas bonne veuillez choisir un chat ou un chien");
        //scan_type_animal= new Scanner(System.in);   
        //type_animal= scan_type_animal.nextLine();
        //type_animal=type_animal.toUpperCase();
        //}
        
        if ( type_animal.equals("CHAT")){
             Chat ton_chat=new Chat("","","maison");
             ton_chat.crier();
             ton_animal=(Chat)ton_chat;

        }
        
        else if (type_animal.equals ("CHIEN")){
             Chien ton_chien=new Chien("","","maison");
             ton_chien.crier();
             ton_animal=(Chien)ton_chien;
        }
        else{
        
        }     
        
        System.out.println("Une nouvelle journée se lève ! vous allez promener votre animal de compagnie !\nOu voulez vous le promener ? Dans la rue (1) ou au parc (2) ?");
        int lieu_balade=0;
        while(lieu_balade!=1||lieu_balade!=2){
        try{
            Scanner scan_lieu_balade=new Scanner(System.in);
            lieu_balade=scan_lieu_balade.nextInt();
            
        }
        catch(Exception e){System.out.println("vous n'avez pas saisie un chiffre veulliez faire une nouvelle saisie");
        }
        if(lieu_balade == 1){
            ton_animal.sedeplacer("rue");
            hero.sedeplacer("rue");
        }
        else if(lieu_balade == 2){
            ton_animal.sedeplacer("parc");
             hero.sedeplacer("parc");
        }
        else{System.out.println("veuillez choisir entre 1 et 2 s'il vous plait ");
    
        }
        }
        System.out.println("Pendant votre balade vous vous rendez compte que votre animal ne se sent pas bien !");
        System.out.println("Vous rencontrez machin qui semble vouloir vous aidez à transporter votre animal chez le veterinaire !");
        Voleur voleur = new Voleur("bertrand","RUE","plombier");
        System.out.println("Cependant sur le trajet vous avez un moment d'inattention il s'empare de votre animal ! ");
        voleur.kidnapper_animal(ton_animal);
        ton_animal.est_il_kidnapper(ton_animal);
    }
    
}
