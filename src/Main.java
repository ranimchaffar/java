public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestion = new AffectationHashMap();

        // Création d'employés
        Employee e1 = new Employee(1, "Alice");
        Employee e2 = new Employee(2, "Bob");

        // Création de départements
        Departement d1 = new Departement(1, "Informatique");
        Departement d2 = new Departement(2, "RH");

        // Ajout d'affectations
        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);

        // Affichage des affectations
        System.out.println("Affectations initiales :");
        gestion.afficherEmployesEtDepartements();

        // Recherche d'un employé
        System.out.println("Recherche employé Alice : " + gestion.rechercherEmploye(e1));

        // Suppression d'un employé
        gestion.supprimerEmploye(e1);

        // Affichage après suppression
        System.out.println("Après suppression d'Alice :");
        gestion.afficherEmployesEtDepartements();
    }
}
