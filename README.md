﻿# Java-Prosits
![Version Actuelle](https://img.shields.io/badge/version-v1.2-blue)

&nbsp;&nbsp;&nbsp;**Créé par :** `Chaffar Ranim`  
&nbsp;&nbsp;&nbsp;**Encadré par :** `Klai Ghassen`

## Table des Matières
- [Commencer](#commencer)
	- [Outils Requis](#outils-requis)
- [Branches](#branches)
- [Auteurs](#auteurs)

## Commencer

Le projet comporte plusieurs branches : `main`, `Prosit-1` -> `Prosit-12`

* `main` contient le code agrégé de toutes les branches.
* `Prosit-1` -> `Prosit-8` : chaque branche contient le code spécifique à son propre Prosit, développant le projet de gestion du Zoo.
* `Prosit-9` -> `Prosit-12` : chaque branche contient le code spécifique au projet de gestion des employés.

### Outils Requis

Vous aurez besoin des outils suivants pour développer et exécuter le projet :

* Un éditeur de texte ou un IDE (comme IntelliJ).
* Un environnement valide qui permet d'exécuter des projets Java sans exceptions.

## Branches

Voici les liens vers chaque branche du projet :

1. [Prosit-1](https://github.com/ranimchaffar/java/tree/prosit1)
Le projet consiste à créer une classe principale nommée `ZooManagement`, qui gère la numérisation des informations d’un zoo. Cette classe inclut deux variables : `nbrCages` (initialisée à 20) et `zooName` (initialisée à "my zoo"), et affiche un message informatif comme : *"my zoo comporte 20 cages"*. Le projet intègre également une interaction utilisateur permettant de saisir le nombre de cages et le nom du zoo via le clavier, avec une validation des données saisies (par exemple, s’assurer que le nombre de cages est valide). Une fois les données entrées, les informations mises à jour sont affichées dynamiquement à l’écran. Ce projet met en pratique des concepts clés de Java, notamment la gestion des entrées utilisateur à l’aide de la classe `Scanner`, les classes principales et l’affichage dynamique.

2. [Prosit-2](https://github.com/ranimchaffar/java/tree/prosit2)
Le projet consiste à créer deux classes, `Zoo` et `Animal`, avec des attributs spécifiques. Dans la méthode `main`, des objets comme un `lion` et un zoo (`myZoo`) sont créés, et leurs attributs sont initialisés. Pour simplifier, des constructeurs paramétrés sont ajoutés pour réduire le code d’initialisation. Une méthode `displayZoo()` permet d’afficher les informations d’un zoo. Les ajustements nécessaires assurent un affichage cohérent des informations pour les classes `Zoo` et `Animal`, tout en appliquant des concepts clés comme les tableaux, les constructeurs et la POO.

3. [Prosit-3](https://github.com/ranimchaffar/java/tree/prosit3)

Le projet consiste à enrichir la classe `Zoo` avec des méthodes pour gérer les animaux efficacement. La méthode `addAnimal(Animal animal)` permet d’ajouter un animal au zoo en vérifiant si la capacité maximale (25 animaux) n’est pas dépassée. Une méthode pour afficher les animaux et une méthode `searchAnimal` pour rechercher un animal par son nom sont également ajoutées. Ces fonctionnalités introduisent la gestion des doublons en s’assurant qu’un animal est unique dans le zoo.
Les améliorations incluent une méthode `removeAnimal` pour supprimer un animal, la transformation de l’attribut `nbrCages` en constante, et une méthode `isZooFull()` pour vérifier si le zoo a atteint sa capacité maximale. Enfin, une méthode `comparerZoo` compare deux zoos et retourne celui ayant le plus d’animaux. Ces évolutions renforcent la gestion des données et appliquent des concepts avancés comme les validations, les constantes et la comparaison d’objets en Java.

4. [Prosit-4](https://github.com/ranimchaffar/java/tree/prosit4)
Le projet vise à améliorer la gestion du zoo en modifiant la méthode `addAnimal` pour intégrer la vérification de la capacité du zoo via `isZooFull()`. Les règles métier sont renforcées pour protéger les attributs des classes : un animal ne peut pas avoir un âge négatif et le nom du zoo ne peut pas être vide. Les attributs sont rendus privés et leur modification se fait uniquement via des méthodes adaptées.
Pour organiser le code, des packages structurés sont utilisés : `tn.esprit.gestionzoo.main` pour la classe principale et `tn.esprit.gestionzoo.entities` pour les entités `Zoo` et `Animal`. Ces changements améliorent la lisibilité, la robustesse et l'organisation du code tout en respectant les principes de la programmation orientée objet.

5. [Prosit-5](https://github.com/ranimchaffar/java/tree/prosit5)
Le projet évolue pour intégrer une hiérarchie de classes différenciant les animaux aquatiques et terrestres. La classe `Aquatic` inclut l'attribut `habitat`, tandis que `Terrestrial` a l'attribut `nbrLegs`. Les sous-classes `Dolphin` et `Penguin` ajoutent des caractéristiques spécifiques, respectivement `swimmingSpeed` et `swimmingDepth`.
Dans la méthode `main`, des instances de chaque classe sont créées à l'aide de constructeurs par défaut, puis avec des constructeurs paramétrés, en protégeant les attributs pour garantir la validité des données. La méthode `toString()` est redéfinie dans les sous-classes pour afficher les attributs communs et spécifiques, permettant une présentation claire des objets dans la méthode `main`.
La méthode `swim()` est ajoutée dans les classes `Aquatic`, `Dolphin` et `Penguin`, chacune affichant un message spécifique. Lors de son invocation sur les objets, le comportement polymorphique est observé, montrant comment les méthodes redéfinies sont appelées en fonction du type de l'objet.
Ces ajouts introduisent des concepts avancés comme l'héritage, la redéfinition de méthodes et le polymorphisme, renforçant l'organisation et les fonctionnalités du projet.

6. [Prosit-6](https://github.com/ranimchaffar/java/tree/prosit6)
Le projet se concentre sur l'intégration et la gestion des animaux aquatiques dans un zoo. Un tableau `aquaticAnimals`, capable de contenir jusqu'à 10 animaux aquatiques, est ajouté à la classe `Zoo`, accompagné de la méthode `addAquaticAnimal(Aquatic aquatic)` pour y ajouter des animaux. Dans la méthode `main`, des animaux aquatiques sont ajoutés au tableau, et leurs méthodes `swim()` sont appelées pour observer le comportement polymorphique.

La méthode `swim()` est ensuite rendue obligatoire pour toutes les classes filles d'`Aquatic`, renforçant le polymorphisme. Des fonctionnalités supplémentaires, comme `maxPenguinSwimmingDepth()`, permettent de calculer la profondeur maximale des pingouins, tandis que `displayNumberOfAquaticsByType()` affiche le nombre de dauphins et de pingouins dans le zoo.

Enfin, la méthode `equals()` est redéfinie dans la classe `Aquatic`, en considérant deux animaux aquatiques comme identiques s’ils partagent le même nom, âge et habitat. Ces ajouts renforcent l'utilisation de concepts comme l'héritage, le polymorphisme, la redéfinition de méthodes, et la gestion avancée des collections.

7. [Prosit-7](https://github.com/ranimchaffar/java/tree/prosit7)
Le projet introduit des exceptions personnalisées pour améliorer la robustesse de l'application. La méthode `addAnimal` lève une exception `ZooFullException` si la capacité maximale (3 cages pour le test) est atteinte, et une exception `InvalidAgeException` empêche l’ajout d’animaux avec un âge négatif. Ces exceptions sont gérées dans la méthode `main`, permettant d’afficher le nombre d’animaux après chaque tentative d’ajout. Cela garantit la fiabilité en intégrant la gestion des erreurs et des données invalides.

8. [Prosit-8](https://github.com/ranimchaffar/java/tree/prosit8)
Le projet introduit des interfaces pour modéliser les régimes alimentaires : `Carnivore<T>` (`eatMeat`), `Herbivore<T>` (`eatPlant`), et `Omnivore<T>` (`eatPlantAndMeat`), héritant des deux premières. Une énumération `Food` avec les valeurs `MEAT`, `PLANT` et `BOTH` est créée. 
La classe `Aquatic` implémente `Carnivore` et la classe `Terrestrial` implémente `Omnivore`, redéfinissant les méthodes avec `Food` comme paramètre. Dans `main`, des objets `Aquatic`, `Penguin` et `Terrestrial` sont créés pour tester les comportements alimentaires, illustrant l’utilisation d’interfaces et d’énumérations en Java.

9. [Prosit-9](https://github.com/ranimchaffar/java/tree/prosit9)
Le projet développe une application pour gérer les employés d'une société tunisienne. La classe `Employe` inclut des attributs (`id`, `nom`, `prénom`, `nomDépartement`, `grade`), deux constructeurs, des getters/setters, et redéfinit `equals` (basé sur `id` et `nom`) et `toString`. 

L’interface générique `IGestion<T>` propose des méthodes pour ajouter, rechercher, supprimer, afficher et trier les employés (`id` avec `Comparable`, `nomDépartement` et `grade` avec `Comparator`). La classe `SocieteArrayList`, implémentant `IGestion`, utilise une `ArrayList` pour gérer efficacement les employés, appliquant des concepts de POO, interfaces, et collections.

10. [Prosit-10](https://github.com/ranimchaffar/java/tree/prosit10)
Le projet vise à gérer les départements d'une société via une classe `Departement`, définie par les attributs `id`, `nomDépartement`, et `nbrEmployes`. Elle inclut deux constructeurs (dont un par défaut), des getters et setters, ainsi que les redéfinitions de `equals` (basé sur `id` et `nom`) et `toString`.

Une interface `IDepartement` est créée pour structurer les opérations de gestion des départements. La classe `DepartementHashSet`, implémentant cette interface, utilise un `HashSet` pour gérer efficacement la liste des départements, tirant parti des concepts de collections, d’interfaces, et de programmation orientée objet en Java.

11. [Prosit-11](https://github.com/ranimchaffar/java/tree/prosit11)
Le projet gère l’affectation des employés aux départements via une classe `AffectationHashMap` basée sur une collection `HashMap`. Les fonctionnalités incluent :

- **Affectation** : `ajouterEmployeDepartement` associe un employé à un seul département.
- **Affichage** : `afficherEmployesEtDepartements`, `afficherEmployes`, et `afficherDepartements` visualisent les données.
- **Suppression** : `supprimerEmploye` et `supprimerEmployeEtDepartement` gèrent les suppressions.
- **Recherche** : `rechercherEmploye` et `rechercherDepartement` vérifient l’existence d’un élément.
- **Tri** : `trierMap` renvoie un `TreeMap` trié par identifiant.

Ce système exploite efficacement les collections pour une gestion simple et performante des affectations.



12. [Prosit-12](https://github.com/ranimchaffar/java/tree/prosit12)
Le projet gère les étudiants via la classe `Student` (attributs : `id`, `nom`, `age`, avec constructeurs, getters/setters, et `toString`) et l’interface `Management`. 

L'interface propose : 
- **Affichage** : `displayStudents` et `displayStudentsByFilter`.
- **Transformation** : `returnStudentsNames` (retourne les noms via `Function`).
- **Création** : `createStudent` (génère un étudiant avec un `Supplier`).
- **Tri** : `sortStudentsById` (trie par ID via `Comparator`).
- **Stream** : `convertToStream` (liste en flux).

La classe `StudentManagement` implémente ces méthodes, utilisant des API fonctionnelles pour une gestion moderne et efficace.


## Auteurs

#### Chaffar Ranim
* [GitHub](https://github.com/ranimchaffar)  
* [LinkedIn](https://www.linkedin.com/in/chaffar-ranim-b5419225b/)
