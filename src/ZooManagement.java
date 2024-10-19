public class ZooManagement {
    public static void main(String[] args) {
        // Créer une instance du zoo
        Zoo myZoo = new Zoo("Zoo de Paris", "Paris");

        // Créer des instances d'animaux aquatiques
        Dolphin dolphin = new Dolphin("Cetacea", "Flipper", 8, true, "Océan", 25.5f);
        Penguin penguin1 = new Penguin("Bird", "Pingu", 5, false, "Arctique", 30.5f);
        Penguin penguin2 = new Penguin("Bird", "Pinga", 7, false, "Arctique", 40.0f);

        // Ajouter les animaux aquatiques au zoo
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        // Afficher les animaux qui nagent
        System.out.println("\nAffichage des comportements de nage :");
        myZoo.displayAllSwim();

        // Ajouter des animaux terrestres au zoo
        Animal lion = new Animal("Felidae", "Simba", 5, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 10, false);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(giraffe);

        // Afficher le zoo
        System.out.println("\nInformations sur le zoo :");
        myZoo.displayZoo();

        // Rechercher un animal par son nom
        String searchName = "Simba";
        int animalIndex = myZoo.searchAnimal(searchName);
        if (animalIndex != -1) {
            System.out.println("\nL'animal " + searchName + " a été trouvé dans le zoo.");
        } else {
            System.out.println("\nL'animal " + searchName + " n'a pas été trouvé dans le zoo.");
        }

        // Supprimer un animal
        boolean removed = myZoo.removeAnimal(lion);
        if (removed) {
            System.out.println("\nL'animal " + lion.getName() + " a été supprimé du zoo.");
        } else {
            System.out.println("\nImpossible de supprimer l'animal " + lion.getName() + ".");
        }

        // Comparer deux zoos (exemple de comparaison)
        Zoo anotherZoo = new Zoo("Zoo de Lyon", "Lyon");
        anotherZoo.addAnimal(new Animal("Panthera", "Bagheera", 6, false));

        System.out.println("\nComparaison entre deux zoos :");
        Zoo biggerZoo = myZoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo ayant le plus d'animaux est : " + biggerZoo.getName());

        // Afficher la profondeur maximale de nage des pingouins
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("\nProfondeur maximale de nage des pingouins : " + maxDepth + " mètres");
    }
}
