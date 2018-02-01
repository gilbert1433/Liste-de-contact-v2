/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class contact {
    public String prénom;
    String nom;
    adresse adresse1;
    occupation occupation1;
    telephone telephone1[]=new telephone[10];

    public String getPrénom() {return prénom;}

    public void setPrénom(String prénom) {this.prénom = prénom;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public adresse getAdresse1() {return adresse1;}

    public void setAdresse1(adresse adresse1) {this.adresse1 = adresse1;}

    public occupation getOccupation1() {return occupation1;}

    public void setOccupation1(occupation occupation1) {this.occupation1 = occupation1;}

    public telephone[] getTelephone1() {return telephone1;}

    public void setTelephone1(telephone[] telephone1) {this.telephone1 = telephone1;}

}
