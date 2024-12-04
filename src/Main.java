public class Main {
	public static void main(String[] args) {
		DepartementHashSet gestionDepartements = new DepartementHashSet();

		Departement dep1 = new Departement(1, "Informatique", 50);
		Departement dep2 = new Departement(2, "Marketing", 30);
		Departement dep3 = new Departement(3, "RH", 20);

		gestionDepartements.ajouterDepartement(dep1);
		gestionDepartements.ajouterDepartement(dep2);
		gestionDepartements.ajouterDepartement(dep3);

		System.out.println("Liste des départements:");
		gestionDepartements.displayDepartement();

		System.out.println("\nRechercher 'Marketing': " + gestionDepartements.rechercherDepartement("Marketing"));

		System.out.println("\nSupprimer 'RH':");
		gestionDepartements.supprimerDepartement(dep3);
		gestionDepartements.displayDepartement();

		System.out.println("\nDépartements triés par ID:");
		gestionDepartements.trierDepartementById().forEach(System.out::println);
	}
}
