public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private static int nbranimals = 0;
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    // Constructeur de la classe Zoo
    public Zoo(String name, String city) {
        setName(name);
        setCity(city);
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
    }

    // Getter et Setter pour le nom du zoo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
    }

    // Getter et Setter pour la ville du zoo
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            throw new IllegalArgumentException("La ville du zoo ne peut pas être vide.");
        }
    }

    // Afficher les informations du zoo
    public void displayZoo() {
        System.out.println(name + " situé à " + city + " avec " + NBR_CAGES + " cages.");
    }

    // Rechercher un animal par son nom
    public int searchAnimal(String name) {
        for (int i = 0; i < nbranimals; i++) {
            if (animals[i] != null && animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    // Ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.getName()) == -1 && !this.isZooFull()) {
            this.animals[nbranimals] = animal;
            nbranimals++;
            return true;
        }
        return false;
    }


    // Supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index != -1) {
            for (int i = index; i < nbranimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbranimals - 1] = null;
            nbranimals--;
            return true;
        }
        return false;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return nbranimals >= NBR_CAGES;
    }

    // Comparer deux zoos en fonction du nombre d'animaux
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNumberOfAnimals() > z2.getNumberOfAnimals()) {
            return z1;
        } else if (z1.getNumberOfAnimals() < z2.getNumberOfAnimals()) {
            return z2;
        } else {
            return this; // Si les deux ont le même nombre, retourner l'actuel
        }
    }

    // Obtenir le nombre d'animaux
    public int getNumberOfAnimals() {
        return nbranimals;
    }

    // Ajouter un animal aquatique au zoo
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Ajout de " + aquatic.getClass().getSimpleName() + " au zoo.");
                break;
            }
        }
    }

    // Afficher la méthode `swim()` de chaque animal aquatique
    public void displayAllSwim() {
        for (Aquatic animal : aquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }
    }

    // Trouver la profondeur maximale de nage des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        for (Aquatic animal : aquaticAnimals) {
            if (animal instanceof Penguin) {
                Penguin penguin = (Penguin) animal;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Obtenir tous les animaux du zoo
    public Animal[] getAnimals() {
        return animals;
    }
}
