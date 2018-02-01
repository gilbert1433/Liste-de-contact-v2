import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        int choix = 0;

        contact tabcontact[] = new contact[20];
        int nbcontact = 0;
        boolean oui;
        String modif;
        boolean choice = true;
        int nbtel = 0;
        int choixapp = 0;


        Scanner sc = new Scanner(System.in);


        while (oui = true) {
            int choix2 = 0;
            System.out.println("Bienvenue à votre liste de contact.\n Que voulez-vous faire?");
            System.out.println("1. Ajouter un contact.");
            System.out.println("2. Modifier un contact.");
            System.out.println("3. Afficher les contacts.");
            System.out.println("4. Quitter le programme.");
            choix2 = sc.nextInt();

            if (choix2 == 1) {


                nbcontact++;
                tabcontact[nbcontact - 1] = new contact();
                System.out.println("Ce contact sera entré à la position" + nbcontact + ".\n" + "Veuillez entrer les informations suivantes :");
                System.out.print("Prénom:");
                tabcontact[nbcontact - 1].setPrénom(sc.next());
                System.out.print("Nom;");
                tabcontact[nbcontact - 1].setNom(sc.next());
                //adresse
                System.out.print("Adresse: \n   Numéro de porte:");
                tabcontact[nbcontact - 1].setAdresse1(new adresse());
                tabcontact[nbcontact - 1].getAdresse1().setNumadresse(sc.next());
                System.out.print("   Rue:");
                tabcontact[nbcontact - 1].getAdresse1().setNomderue(sc.next());
                System.out.print("Avez-vous un numéro d'appartement?(1-oui 2-non)");
                choixapp=sc.nextInt();
                if (choixapp == 1) {
                    System.out.print("   Appartement:");
                    tabcontact[nbcontact - 1].getAdresse1().setAppartement(sc.next());
                }
                System.out.print("   Ville:");
                tabcontact[nbcontact - 1].getAdresse1().setVille(sc.next());
                System.out.print("   Province:");
                tabcontact[nbcontact - 1].getAdresse1().setProvince(sc.next());
                System.out.print("   Pays:");
                tabcontact[nbcontact - 1].getAdresse1().setpays(sc.next());
                //Occupation
                System.out.println("Occupation: ");
                tabcontact[nbcontact - 1].setOccupation1(new occupation());
                System.out.print("   Poste:");
                tabcontact[nbcontact - 1].getOccupation1().setPoste(sc.next());
                //entreprise
                System.out.println("   Entreprise:");
                tabcontact[nbcontact - 1].getOccupation1().setEntreprise1(new entreprise());
                System.out.print("   Nom:");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().setNom(sc.next());
                System.out.println("   Adresse:");
                //adresse de l'entreprise
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().setAdresse1(new adresse());
                System.out.print("      Numéro de porte:");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().setNumadresse(sc.next());
                System.out.print("      Rue:");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().setNomderue(sc.next());
                System.out.print("      Ville:");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().setVille(sc.next());
                System.out.print("      Province:");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().setProvince(sc.next());
                System.out.print("      Pays");
                tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().setpays(sc.next());

                choice=true;
                while (choice == true) {
                    nbtel = 0;
                    System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
                    choix = sc.nextInt();
                    if (choix == 1) {
                        telephone nouveauTelephone = new telephone();
                        System.out.println("À quoi correcpond ce numéro?(information):");
                        tabcontact[nbcontact - 1].getTelephone1()[nbtel] = nouveauTelephone;
                        nouveauTelephone.setInfo(sc.next());
                        System.out.println("Numéro de téléphone:");
                        nouveauTelephone.setNumero(sc.next());


                    } else if (choix == 2) {
                        choice = false;
                    }
                }
            } else if (choix2 == 2) {
                System.out.println("Quel conctact voulez-vous modifier?(Rien+Entrée si vous voulez modifier)");

                for (int i = 0; i < tabcontact.length; i++) {
                    if (tabcontact[i] != null) {
                        System.out.println((i+1) + "-" + tabcontact[i].getPrénom() + " " + tabcontact[i].getNom());
                    }
                }
                choix = sc.nextInt();


                System.out.println("Prénom (" + tabcontact[choix - 1].getPrénom() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].setPrénom(sc.next());
                }

                System.out.println("Nom: (" + tabcontact[choix - 1].getNom() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].setNom(sc.next());
                }

                //adresse
                System.out.println("Adresse: \n   Numéro de porte: (" + tabcontact[choix - 1].getAdresse1().getNumadresse() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getAdresse1().setNumadresse(sc.next());
                }

                System.out.println("   Rue: (" + tabcontact[choix - 1].getAdresse1().getNomderue() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getAdresse1().setNomderue(sc.next());
                }

                if (choixapp == 1) {
                    System.out.println("   Appartement: (" + tabcontact[choix - 1].getAdresse1().getAppartement() + ") : ");
                    modif = sc.nextLine().trim();
                    if (modif.equals("")) {
                    } else {
                        tabcontact[choix - 1].getAdresse1().setAppartement(sc.next());
                    }
                }

                System.out.println("   Ville: (" + tabcontact[choix - 1].getAdresse1().getVille() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getAdresse1().setVille(sc.next());
                }

                System.out.println("   Province: (" + tabcontact[choix - 1].getAdresse1().getProvince() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getAdresse1().setProvince(sc.next());
                }

                System.out.println("   Pays: (" + tabcontact[choix - 1].getAdresse1().getPays() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getAdresse1().setpays(sc.next());
                }

                //Occupation
                System.out.println("Occupation: ");
                System.out.println("   Poste: (" + tabcontact[choix - 1].getOccupation1().getPoste() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().setPoste(sc.next());
                }

                //entreprise
                System.out.println("   Entreprise: ");
                System.out.println("   Nom: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getNom() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().setNom(sc.next());
                }

                System.out.println("   Adresse: ");
                //adresse de l'entreprise
                System.out.println("      Numéro de porte: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getNumadresse() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setNumadresse(sc.next());
                }


                System.out.println("      Rue: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getNomderue() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setNomderue(sc.next());
                }

                System.out.println("      Ville: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getVille() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setVille(sc.next());
                }

                System.out.println("      Province: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getProvince() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setProvince(sc.next());
                }

                System.out.println("      Pays: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getPays() + ") : ");
                modif = sc.nextLine().trim();
                if (modif.equals("")) {
                } else {
                    tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setpays(sc.next());
                }

                for (int i = 0; i < 10; i++) {
                    System.out.println("      information téléphone: (" + tabcontact[choix - 1].getTelephone1()[i].getInfo() + ")");
                    modif = sc.nextLine().trim();
                    if (modif.equals("")) {
                    } else {
                        tabcontact[choix - 1].getTelephone1()[i].setInfo(sc.next());
                    }

                    System.out.println("      numéro de téléphone: (" + tabcontact[choix - 1].getTelephone1()[i].getNumero() + ")");
                    modif = sc.nextLine().trim();
                    if (modif.equals("")) {
                    } else {
                        tabcontact[choix - 1].getTelephone1()[i].setNumero(sc.next());
                    }


                }
            }

            else if (choix2 == 3) {

                    for (int i = 0; i < tabcontact.length; i++) {
                        if (tabcontact[i] != null) {

                            System.out.println("Prénom: " + tabcontact[nbcontact - 1].getPrénom());
                            System.out.println("Nom: " + tabcontact[nbcontact - 1].getNom());
                            //adresse
                            System.out.println("Adresse: \n   Numéro de porte: " + tabcontact[nbcontact - 1].getAdresse1().getNumadresse());
                            System.out.println("   Rue: " + tabcontact[nbcontact - 1].getAdresse1().getNomderue());
                            System.out.println("   Appartement: " + tabcontact[nbcontact - 1].getAdresse1().getAppartement());
                            System.out.println("   Ville: " + tabcontact[nbcontact - 1].getAdresse1().getVille());
                            System.out.println("   Province: " + tabcontact[nbcontact - 1].getAdresse1().getProvince());
                            System.out.println("   Pays: " + tabcontact[nbcontact - 1].getAdresse1().getPays());
                            //Occupation
                            System.out.println("Occupation: ");
                            System.out.println("   Poste: " + tabcontact[nbcontact - 1].getOccupation1().getPoste());
                            //entreprise
                            System.out.println("   Entreprise: ");
                            System.out.println("   Nom: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getNom());
                            System.out.println("   Adresse: ");
                            //adresse de l'entreprise
                            System.out.println("      Numéro de porte: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getNumadresse());
                            System.out.println("      Rue: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getNomderue());
                            System.out.println("      Ville: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getVille());

                            System.out.println("      Province: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getProvince());

                            System.out.println("      Pays: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getPays());

                            for (int j = 0; j < 10; j++) {
                                System.out.println("      Information Téléphone: " + tabcontact[nbcontact - 1].getTelephone1()[j].getInfo());
                                System.out.println("      Numéro de Téléphone: " + tabcontact[nbcontact - 1].getTelephone1()[j].getInfo());

                            }

                        }
                    }
                } else if (choix2 == 4) {
                    System.exit(0);
                } else
                    System.out.println("Error.");

            }
        }
    }

