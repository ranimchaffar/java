import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
	private ArrayList<Employe> employes = new ArrayList<>();

	@Override
	public void ajouterEmploye(Employe employe) {
		employes.add(employe);
	}

	@Override
	public boolean rechercherEmploye(String nom) {
		for (Employe employe : employes) {
			if (employe.getNom().equalsIgnoreCase(nom)) {
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
		for (Employe employe : employes) {
			System.out.println(employe);
		}
	}

	@Override
	public void trierEmployeParId() {
		Collections.sort(employes, Comparator.comparingInt(Employe::getId));
	}

	@Override
	public void trierEmployeParNomDépartementEtGrade() {
		employes.sort(Comparator
				.comparing(Employe::getNom)
				.thenComparing(Employe::getNomDepartement)
				.thenComparingInt(Employe::getGrade));
	}
}
