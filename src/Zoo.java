public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private static int nbranimals = 0;
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.


    public Zoo(String name, String city, int NBR_CAGES) {
        setName(name);  // Use setter for validation
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;}



    public void displayZoo() {
        System.out.println(name + " " + city + " " + NBR_CAGES);
    }

    //    @Override
//    public String toString()
//    {
//        return name + " " + city + " " + nbrCages;
//    }
    int searchAnimal(String name) {
        for (int i = 0; i < nbranimals; i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.getName()) == -1 && !this.isZooFull()) {
            this.animals[nbranimals] = animal;
            nbranimals++;
            return true;
        }
        return false;
    }

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

    public boolean isZooFull() {
        return nbranimals >= NBR_CAGES;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbranimals == z2.nbranimals) {
            return this;
        } else {
            return z1.comparerZoo(z2, this);
        }
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Added " + aquatic.getClass().getSimpleName() + " to the zoo.");
                break;
            }
        }
    }

    // Méthode pour afficher la méthode `swim()` de chaque animal aquatique
    public void displayAllSwim() {
        for (Aquatic animal : aquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }
    }



}
