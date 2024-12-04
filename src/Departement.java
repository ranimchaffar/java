import java.util.Objects;

public class Departement {
	private int id;
	private String nom;

	public Departement(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Departement that = (Departement) o;
		return id == that.id && Objects.equals(nom, that.nom);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nom);
	}

	@Override
	public String toString() {
		return "Departement{" + "id=" + id + ", nom='" + nom + '\'' + '}';
	}
}