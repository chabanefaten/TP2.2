package TP22;

import java.util.HashMap;
import java.util.Map;

public class Entreprise {
    private String nomEntreprise;
    private Map<Integer, Departement> listeDeps;

    public Entreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        this.listeDeps = new HashMap<>();
    }

    public void ajoutDep(Departement d) {
        listeDeps.put(d.getIdDep(), d);
    }

    public void retirerDep(Departement d) {
        listeDeps.remove(d.getIdDep());
    }

    public void afficheE() {
        System.out.println("Nom de l'entreprise: " + nomEntreprise);
        for (Departement dep : listeDeps.values()) {
            dep.afficheDep();
        }
    }

    public void UpdateDep(Employe E, int idDep) {
        Departement oldDep = E.getDepartement();
        oldDep.retirerEmploye(E);
        Departement newDep = listeDeps.get(idDep);
        newDep.ajoutEmploye(E);
    }

    public boolean existeD(Departement d) {
        return listeDeps.containsValue(d);
    }

    public void DepMinCapacity() {
        Departement minDep = null;
        int minCapacity = Integer.MAX_VALUE;
        for (Departement dep : listeDeps.values()) {
            if (dep.getLEmployes().size() < minCapacity) {
                minCapacity = dep.getLEmployes().size();
                minDep = dep;
            }
        }
        System.out.println("Département avec le moins d'employés:");
        minDep.afficheDep();
    }
}