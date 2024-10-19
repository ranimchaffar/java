public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur complet pour Penguin
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Constructeur par défaut
    public Penguin() {}

    // Getter et Setter pour swimmingDepth
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        if (swimmingDepth > 0) {
            this.swimmingDepth = swimmingDepth;
        } else {
            throw new IllegalArgumentException("La profondeur de nage doit être positive.");
        }
    }

    // Implémentation de la méthode abstraite swim()
    @Override
    public void swim() {
        System.out.println("Le pingouin nage dans l'eau glacée à une profondeur de " + swimmingDepth + " mètres.");
    }

    // Redéfinir toString() pour fournir des informations sur le pingouin
    @Override
    public String toString() {
        return "Penguin [nom=" + getName() + ", famille=" + getFamily() + ", âge=" + getAge() +
                ", mammifère=" + isMammal() + ", habitat=" + getHabitat() + ", profondeur de nage=" + swimmingDepth + " mètres]";
    }
}
