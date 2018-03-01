import java.util.Scanner;

/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class Adresse {
    private String numadresse;
    String nomderue;
    String appartement;
    String ville;
    String province;
    String pays;


    public String getNomderue (){return this.nomderue;}
    public void setNomderue (String _nomderue){this.nomderue=_nomderue;}
    public String getNumadresse(){return this.numadresse;}
    public void setNumadresse (String _numadresse){this.numadresse=_numadresse;}
    public String getAppartement (){return this.appartement;}
    public void setAppartement (String _appartement){this.appartement=_appartement;}
    public String getVille (){return this.ville;}
    public void setVille (String _ville){this.ville=_ville;}
    public String getProvince (){return this.province;}
    public void setProvince (String _province){this.province=_province;}
    public String getPays (){return this.pays;}
    public void setpays(String _pays){this.pays=_pays;}

    public int ajouterAdresse(){
        int choixapp=0;
        System.out.print("Adresse: \n   Numéro de porte:");
        numadresse=Main.sc.next();
        System.out.print("   Rue:");
        nomderue=Main.sc.next();
        System.out.print("Avez-vous un numéro d'appartement?(1-oui 2-non)");
        choixapp=Main.sc.nextInt();
        if (choixapp == 1) {
            System.out.print("   Appartement:");
            appartement=Main.sc.next();
        }
        System.out.print("   Ville:");
        ville=Main.sc.next();
        System.out.print("   Province:");
        province=Main.sc.next();
        System.out.print("   Pays:");
        pays=Main.sc.next();
        return choixapp;
    }
    public void ajouterAdresseEntreprise(){
        System.out.println("   Adresse:");
        System.out.print("      Numéro de porte:");
        numadresse=Main.sc.next();
        System.out.print("      Rue:");
        nomderue=Main.sc.next();
        System.out.print("      Ville:");
        ville=Main.sc.next();
        System.out.print("      Province:");
        province=Main.sc.next();
        System.out.print("      Pays:");
        pays=Main.sc.next();
    }




}
