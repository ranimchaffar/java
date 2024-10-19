public abstract class Aquatic extends Animal {
    private String habitat;

    // Constructeur complet pour Aquatic
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Constructeur avec seulement le habitat
    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    // Constructeur par défaut
    public Aquatic() {}

    // Getter et Setter pour habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty()) {
            this.habitat = habitat;
        } else {
            throw new IllegalArgumentException("L'habitat ne peut pas être vide.");
        }
    }

    // Méthode abstraite swim : chaque classe dérivée doit implémenter sa version de la méthode swim
    public abstract void swim();
}
