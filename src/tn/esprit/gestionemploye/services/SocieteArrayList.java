package tn.esprit.gestionemploye.services;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.interfaces.IGestion;
import tn.esprit.gestionemploye.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> compareByDept = Comparator.comparing(Employe::getNomDepartement);
        Comparator<Employe> compareByGrade = Comparator.comparingInt(Employe::getGrade);
        Comparator<Employe> compareByName = Comparator.comparing(Employe::getNom);

        employes.sort(compareByDept.thenComparing(compareByGrade).thenComparing(compareByName));
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
