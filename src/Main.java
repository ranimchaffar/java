import java.util.Objects;

public class Main {
	public static void main(String[] args) {
		SocieteArrayList societe = new SocieteArrayList();

		Employe e1 = new Employe(1, "Doe", "John", "IT", 5);
		Employe e2 = new Employe(2, "Smith", "Anna", "HR", 4);
		Employe e3 = new Employe(3, "Brown", "James", "Finance", 3);

		societe.ajouterEmploye(e1);
		societe.ajouterEmploye(e2);
		societe.ajouterEmploye(e3);

		System.out.println("Liste des employés:");
		societe.displayEmploye();

		System.out.println("\nRecherche employé par nom (Doe): " + societe.rechercherEmploye("Doe"));

		System.out.println("\nRecherche employé par instance: " + societe.rechercherEmploye(e1));

		// Tri par ID
		System.out.println("\nTri par ID:");
		societe.trierEmployeParId();
		societe.displayEmploye();

		System.out.println("\nTri par Nom, Département et Grade:");
		societe.trierEmployeParNomDépartementEtGrade();
		societe.displayEmploye();
	}
}
