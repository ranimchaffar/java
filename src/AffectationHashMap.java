import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
	// Collection dynamique : HashMap pour stocker Employé-Département
	private HashMap<Employee, Departement> affectations;

	// Constructeur
	public AffectationHashMap() {
		affectations = new HashMap<>();
	}

	// Méthode pour ajouter un employé à un département
	public void ajouterEmployeDepartement(Employee e, Departement d) {
		affectations.put(e, d);
	}

	// Méthode pour afficher les employés et leurs départements
	public void afficherEmployesEtDepartements() {
		affectations.forEach((employee, departement) ->
				System.out.println("Employé : " + employee + " -> Département : " + departement));
	}

	// Méthode pour supprimer un employé
	public void supprimerEmploye(Employee e) {
		affectations.remove(e);
	}

	// Méthode pour supprimer un employé d'un département
	public void supprimerEmployeEtDepartement(Employee e, Departement d) {
		if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
			affectations.remove(e);
		}
	}

	// Méthode pour afficher tous les employés
	public void afficherEmployes() {
		affectations.keySet().forEach(System.out::println);
	}

	// Méthode pour afficher tous les départements
	public void afficherDepartements() {
		affectations.values().forEach(System.out::println);
	}

	// Méthode pour rechercher un employé
	public boolean rechercherEmploye(Employee e) {
		return affectations.containsKey(e);
	}

	// Méthode pour rechercher un département
	public boolean rechercherDepartement(Departement d) {
		return affectations.containsValue(d);
	}

	// Méthode pour trier les employés par leur ID
	public TreeMap<Employee, Departement> trierMap() {
		TreeMap<Employee, Departement> sortedMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
		sortedMap.putAll(affectations);
		return sortedMap;
	}
}
