public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Constructeur complet pour Dolphin
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Constructeur par défaut
    public Dolphin() {}

    // Getter et Setter pour swimmingSpeed
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        if (swimmingSpeed > 0) {
            this.swimmingSpeed = swimmingSpeed;
        } else {
            throw new IllegalArgumentException("La vitesse de nage doit être positive.");
        }
    }

    // Implémentation de la méthode abstraite swim()
    @Override
    public void swim() {
        System.out.println("Le dauphin nage gracieusement à une vitesse de " + swimmingSpeed + " km/h.");
    }

    // Redéfinir toString() pour fournir des informations sur le dauphin
    @Override
    public String toString() {
        return "Dolphin [nom=" + getName() + ", famille=" + getFamily() + ", âge=" + getAge() +
                ", mammifère=" + isMammal() + ", habitat=" + getHabitat() + ", vitesse de nage=" + swimmingSpeed + " km/h]";
    }
}
