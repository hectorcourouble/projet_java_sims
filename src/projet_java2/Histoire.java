package projet_java2;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hecto
 */
public class Histoire {
    
    
    
public static void ecrire(String text)throws IOException{
        
        System.out.println(text);
        FileWriter out = null;
        
        try{out = new FileWriter("test.txt");
        
        out.write(text);
        out.close();
        }
        catch(Exception e){System.out.println("erreur");
        out.close();
        }
}

public static void commencer_histoire()throws IOException{ 
        File f = new File("test.txt");
        
        ecrire("Bienvenue sur Les sims. Nous sommes dans Smallville, une belle ville mais elle abrite beaucoup de truants. Très attachés à leurs animaux, les sims sont de belles personnes qui veulent combattre la méchanceté et vivre en paix avec leurs boules de poils! A vous de jouer !\nVeuillez choisir le nom de votre personnage : ");
        Scanner scan_nom_hero = new Scanner(System.in);
        String nom_hero =scan_nom_hero.nextLine();
        System.out.println("Quel est votre metier ?");
        Scanner scan_metier_hero = new Scanner(System.in);
        String metier_hero =scan_metier_hero.nextLine();
        Sims hero = new Sims(nom_hero,"maison",metier_hero);
        System.out.println("Maintenant, vous allez pouvoir choisir quel est votre animal de compagnie.\nVoulez-vous un Chat ou un Chien?");
        
        String type_animal="";
        Animal ton_animal = null;
        while (type_animal.equals("")){
        //System.out.println("votre saisie n'est pas bonne veuillez choisir un chat ou un chien");
        Scanner scan_type_animal= new Scanner(System.in);   
        type_animal= scan_type_animal.nextLine();
        type_animal=type_animal.toUpperCase();
        //}
        switch(type_animal){
            case "CHAT":
            Chat ton_chat=new Chat("","","la maison");
            ton_animal=(Chat)ton_chat;
            hero.carresser_animal(ton_animal);

            break;

            case "CHIEN":
            Chien ton_chien=new Chien("","","la maison");
            ton_animal=(Chien)ton_chien;
            hero.carresser_animal(ton_animal);
            break;
            
            default:
            type_animal="";  
            System.out.println("votre saisie n'est pas bonne veuillez choisir un chat ou un chien");
            break;
            }
        }
        
        System.out.println("Une nouvelle journée se lève ! vous allez promener votre animal de compagnie !\nOu voulez vous le promener ? Dans la rue (1) ou au parc (2) ?");
        int lieu_balade=0;
        String lieu_kidnapping="";
        while(lieu_balade==0){
        try{
            Scanner scan_lieu_balade=new Scanner(System.in);
            lieu_balade=scan_lieu_balade.nextInt();
            
        }
        catch(Exception e){System.out.println("vous n'avez pas saisie un chiffre, veulliez faire une nouvelle saisie");
        }
        switch(lieu_balade){
            case 1:
            ton_animal.sedeplacer("rue");
            hero.sedeplacer("rue");
            lieu_kidnapping="rue";
            System.out.println("Pendant votre balade vous vous rendez compte que votre animal ne se sent pas bien !");
            System.out.println("Vous rencontrez Nehuda qui semble vouloir vous aidez à transporter votre animal chez le veterinaire !");
            Bimbo bimbo_nehuda = new Bimbo("Nehouda","Rue","estheticienne");
            System.out.println("Cependant sur le trajet vers le veterinaire vous avez un moment d'inattention et elle s'empare de votre animal ! ");
            bimbo_nehuda.kidnapper_animal(ton_animal);
            ton_animal.est_il_kidnapper(ton_animal);
            break;
        
            case 2:            
            ton_animal.sedeplacer("parc");
            hero.sedeplacer("parc");
            lieu_kidnapping="parc";
            System.out.println("Pendant votre balade vous vous rendez compte que votre animal ne se sent pas bien !");
            System.out.println("Vous rencontrez Arthur qui semble vouloir vous aidez à transporter votre animal chez le veterinaire !");
            Voleur voleur_arthur = new Voleur("Arthur",lieu_kidnapping,"plombier");
            System.out.println("Cependant sur le trajet vers le veterinaire vous avez un moment d'inattention et il s'empare de votre animal ! ");
            voleur_arthur.kidnapper_animal(ton_animal);
            ton_animal.est_il_kidnapper(ton_animal);
            break;
        
            default:
            System.out.println("veuillez choisir entre 1 et 2 s'il vous plait ");
            lieu_balade=0;
            break;
            }
        }
        System.out.println("Vous vous retrouvez tout seul ! :( \nMais vous faites une deuxième rencontre !");
        int r = new Random().nextInt(2);
        //System.out.println(r);
        int aide=0;
        
        if (r==0){
            Femme maria = new Femme("Maria",lieu_kidnapping,"institutrice");
            System.out.println("Décrivez la femme de vos reves : ");
            Scanner scan_look_maria = new Scanner(System.in);
            String look_maria = scan_look_maria.nextLine();
            maria.set_look(look_maria);
            maria.get_look(); 
            System.out.println("Maria vous propose de vous aider a retrouver votre animal de compagnie, voulez vous accepter ? oui (1) non (2)");
           
            try{
            Scanner scan_aide=new Scanner(System.in);
            aide=scan_aide.nextInt();
            switch(aide){
            
                case 1:
                    System.out.println("Vous avez accepter l'aide de Maria, vous partez ensemble rechercher votre animal.");
                    break;
                    
                case 2:
                    break;
                
                default:
                    aide=0;
                    break;
            }    
        }
        catch(Exception e){System.out.println("vous n'avez pas saisie un chiffre, veulliez faire une nouvelle saisie");
        }
        }
        if (r==1){
            Bimbo jessica = new Bimbo("Jessica",lieu_kidnapping,"influenceuse instagramme");
            System.out.println("Jessica vous propose de vous aider a retrouver votre animal pour 100€, voulez vous accepter ? oui (1) non (2)");
        try{
            Scanner scan_aide=new Scanner(System.in);
            aide=scan_aide.nextInt();
            switch(aide){
            
                case 1:
                    System.out.println("Vous avez accepter l'aide de Jessica, elle vous donne un numero de telephone et part de son cote chercher votre animal.");
                    break;
                    
                case 2:
                    System.out.println("Vous n'avez pas accepter l'aide de Jessica, vouss avez bien fait ! il s'agissait d'une bimbo !");
                    break;
                
                default:
                    aide=0;
                    break;
            }    
        }
        catch(Exception e){System.out.println("vous n'avez pas saisie un chiffre, veulliez faire une nouvelle saisie");
        }
        }
    }
}
