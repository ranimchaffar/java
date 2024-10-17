public class Terrestrial extends Animal {
    private int nbrLegs; // Attribut spécifique pour représenter le nombre de pattes

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal); // Appelle le constructeur de la classe parente
        this.nbrLegs = nbrLegs;
    }

    // Getter pour nbrLegs
    public int getNbrLegs() {
        return nbrLegs;
    }

    // Setter pour nbrLegs
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}


