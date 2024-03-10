package TP22;

import java.util.HashSet;
import java.util.Set;

public class Departement {
    private int idDep;
    private Set<Employe> LEmployes;

    public Departement(int idDep) {
        this.idDep = idDep;
        this.LEmployes = new HashSet<>();
    }
    

    public int getIdDep() {
		return idDep;
	}


	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}


	public Set<Employe> getLEmployes() {
		return LEmployes;
	}


	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}


	public void ajoutEmploye(Employe E) {
        if (E.getCin() > 0) {
            E.setDepartement(this);
            LEmployes.add(E);
        }
    }

    public void retirerEmploye(Employe E) {
        LEmployes.remove(E);
    }

    public void afficheDep() {
        System.out.println("Département ID: " + idDep);
        System.out.println("Nombre d'employés: " + LEmployes.size());
    }

    public boolean existeE(int cin) {
        for (Employe emp : LEmployes) {
            if (emp.getCin() == cin) {
                return true;
            }
        }
        return false;
    }

    public Employe getEmpSalMax() {
        Employe empSalMax = null;
        double maxSalaire = Double.MIN_VALUE;
        for (Employe emp : LEmployes) {
            if (emp.getSalaire() > maxSalaire) {
                maxSalaire = emp.getSalaire();
                empSalMax = emp;
            }
        }
        return empSalMax;
    }
}
