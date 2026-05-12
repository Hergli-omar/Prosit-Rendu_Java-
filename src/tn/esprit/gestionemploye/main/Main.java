package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.services.SocieteArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Trabelsi", "Sami", "IT", 2);
        Employe e2 = new Employe(1, "Ben Ali", "Mohamed", "RH", 1);
        Employe e3 = new Employe(4, "Mansour", "Aymen", "IT", 1);
        Employe e4 = new Employe(2, "Ben Ali", "Ahmed", "Finance", 3);

        System.out.println("--- Ajout des employés ---");
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.displayEmploye();

        System.out.println("\n--- Recherche de l'employé par nom 'Mansour' ---");
        System.out.println("Résultat: " + societe.rechercherEmploye("Mansour"));

        System.out.println("\n--- Recherche de l'employé par objet (e1) ---");
        System.out.println("Résultat: " + societe.rechercherEmploye(e1));

        System.out.println("\n--- Suppression de l'employé e4 ---");
        societe.supprimerEmploye(e4);
        societe.displayEmploye();

        // Ré-ajout pour tester les tris
        societe.ajouterEmploye(e4);

        System.out.println("\n--- Tri naturel (par id) ---");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n--- Tri personnalisé (par département, puis grade, puis nom) ---");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n--- Recherche avancée par département (IT) ---");
        List<Employe> itEmployes = societe.rechercherParDepartement("IT");
        for (Employe e : itEmployes) {
            System.out.println(e);
        }

        System.out.println("\n==============================================");
        System.out.println("TESTS DE LA GESTION DES DEPARTEMENTS (HashSet)");
        System.out.println("==============================================");

        tn.esprit.gestionemploye.services.DepartementHashSet depManager = new tn.esprit.gestionemploye.services.DepartementHashSet();
        
        tn.esprit.gestionemploye.entities.Departement d1 = new tn.esprit.gestionemploye.entities.Departement(3, "IT", 50);
        tn.esprit.gestionemploye.entities.Departement d2 = new tn.esprit.gestionemploye.entities.Departement(1, "RH", 20);
        tn.esprit.gestionemploye.entities.Departement d3 = new tn.esprit.gestionemploye.entities.Departement(4, "Finance", 30);
        tn.esprit.gestionemploye.entities.Departement d4 = new tn.esprit.gestionemploye.entities.Departement(2, "Marketing", 15);
        tn.esprit.gestionemploye.entities.Departement d5 = new tn.esprit.gestionemploye.entities.Departement(3, "IT", 50); // Doublon (même id et nom)

        System.out.println("--- Ajout des départements ---");
        depManager.ajouterDepartement(d1);
        depManager.ajouterDepartement(d2);
        depManager.ajouterDepartement(d3);
        depManager.ajouterDepartement(d4);
        depManager.ajouterDepartement(d5); // Ne devrait pas être ajouté car HashSet (grâce à equals/hashCode)
        depManager.afficherDepartements();

        System.out.println("\n--- Recherche de département par nom (RH) ---");
        System.out.println("Résultat: " + depManager.rechercherDepartement("RH"));

        System.out.println("\n--- Recherche de département par objet (d1) ---");
        System.out.println("Résultat: " + depManager.rechercherDepartement(d1));

        System.out.println("\n--- Suppression du département d4 (Marketing) ---");
        depManager.supprimerDepartement(d4);
        depManager.afficherDepartements();
        
        // Ré-ajout pour les tris
        depManager.ajouterDepartement(d4);

        System.out.println("\n--- Tri des départements par ID ---");
        depManager.trierDepartementsParId();

        System.out.println("\n--- Tri des départements par Nom et Nombre d'employés ---");
        depManager.trierDepartementsParNomEtNombreEmployes();
    }
}
