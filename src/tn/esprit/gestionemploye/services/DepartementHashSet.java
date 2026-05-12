package tn.esprit.gestionemploye.services;

import tn.esprit.gestionemploye.entities.Departement;
import tn.esprit.gestionemploye.interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        // Le tri est effectué en passant les éléments dans un TreeSet (qui utilise Comparable)
        TreeSet<Departement> sortedSet = new TreeSet<>(departements);
        for (Departement d : sortedSet) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        // Création d'un Comparator personnalisé
        Comparator<Departement> compareByNom = Comparator.comparing(Departement::getNomDepartement);
        Comparator<Departement> compareByNbEmployes = Comparator.comparingInt(Departement::getNombreEmployes);

        // Tri via un TreeSet avec le Comparator
        TreeSet<Departement> sortedSet = new TreeSet<>(compareByNom.thenComparing(compareByNbEmployes));
        sortedSet.addAll(departements);

        for (Departement d : sortedSet) {
            System.out.println(d);
        }
    }
}
