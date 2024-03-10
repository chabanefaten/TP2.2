package TP22;

public class test {

	public class Main {
	    public static void main(String[] args) {
	      
	        Departement dep1 = new Departement(1);
	        Departement dep2 = new Departement(2);
	      
	        Employe emp1 = new Employe(1, "faten", 3000, dep1);
	        Employe emp2 = new Employe(2, "yasmine", 2500, dep1);
	        Employe emp3 = new Employe(3, "oussama", 2800, dep2);

	        dep1.ajoutEmploye(emp1);
	        dep1.ajoutEmploye(emp2);
	        dep2.ajoutEmploye(emp3);

	      
	        Entreprise entreprise = new Entreprise("Hi every one");
	        entreprise.ajoutDep(dep1);
	        entreprise.ajoutDep(dep2);
	        entreprise.afficheE();
	        entreprise.UpdateDep(emp2, 2);    
	        System.out.println("Le département dep1 appartient-il à l'entreprise ? " + entreprise.existeD(dep1));
	        entreprise.DepMinCapacity();
	    }
	}

	
	
	
	
}
