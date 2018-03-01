/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class Occupation {
    private String poste;
    Entreprise entreprise1;

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Entreprise getEntreprise1() {
        return entreprise1;
    }

    public void setEntreprise1(Entreprise entreprise1) {
        this.entreprise1 = entreprise1;
    }
    public void ajouterOccupation(){
        System.out.println("Occupation: ");
        System.out.print("   Poste:");
       poste=Main.sc.next();
    }

}
