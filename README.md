# Projet PROSITs

Bienvenue dans le dépôt Git des PROSITs de Ranim Chaffar. Ce dépôt contient différents travaux PROSIT réalisés au cours du projet. Chaque PROSIT est organisé par branche Git. Vous pouvez naviguer dans les branches pour explorer le contenu associé à chaque PROSIT.

## Liste des PROSITs

1. **[Main](https://github.com/ranimchaffar/java/tree/main)**  
   - **Description** :

2. **[Prosit1](https://github.com/ranimchaffar/java/tree/prosit1)**  
   ### **PROSIT 1 : Développement d'un logiciel de gestion de zoo**
**Description** :
**Contexte :**  
En tant qu'ingénieur récemment recruté chez **ESPRIT TECH**, vous avez intégré une équipe de développeurs ayant pour mission de concevoir des programmes en Java. Votre premier projet consiste à développer un logiciel permettant de numériser la gestion d’un zoo. Ce projet implique l'application de concepts fondamentaux de Java, comme les classes, les variables, et l'interaction avec l'utilisateur.

---

### **Objectifs :**
1. **Créer une classe principale** pour représenter la gestion du zoo, avec des propriétés spécifiques comme le nom du zoo et le nombre de cages.
2. **Personnaliser le logiciel** pour permettre à l’utilisateur de configurer les paramètres (nom du zoo et nombre de cages) via une saisie clavier.
3. **Afficher les informations** saisies pour vérifier et valider les changements apportés par l'utilisateur.

---

### **Étapes de réalisation :**

#### **Instruction 1 : Classe de base `ZooManagement`**
- Création de la classe principale `ZooManagement`.
- Déclaration et initialisation des variables suivantes :
  - **`nbrCages`** : entier représentant le nombre de cages (initialisé à `20`).
  - **`zooName`** : chaîne de caractères représentant le nom du zoo (initialisé à `"my zoo"`).
- Affichage d’un message combinant les deux variables sous le format :  
  **Exemple :** `"my zoo comporte 20 cages"`.

#### **Instruction 2 : Interaction avec l'utilisateur**
- Modification de la classe pour permettre à l'utilisateur d'entrer :
  - Le **nombre de cages** à gérer.
  - Le **nom du zoo**.
- Utilisation de l’objet **Scanner** pour collecter les entrées utilisateur depuis le clavier.
- Validation des données pour s’assurer que les informations saisies sont correctes.

#### **Instruction 3 : Affichage des mises à jour**
- Une fois les données saisies, affichage des nouvelles informations saisies par l'utilisateur pour confirmer les changements.

---

### **Compétences développées :**
- Création et manipulation de classes en Java.
- Utilisation des structures de base du langage (variables, affichage, entrée utilisateur).
- Validation des données entrées par l’utilisateur pour garantir la robustesse du logiciel.
- Application pratique de l'objet **Scanner** pour la gestion des interactions utilisateur.

---

**Livrable final :**  
Un programme Java fonctionnel qui affiche un message personnalisé sur la gestion d’un zoo, tout en permettant à l'utilisateur de configurer les paramètres de manière interactive.
exemple d'une affichage attendu:

my zoo comporte 20 cages

Veuillez entrer le nom du zoo :
>> Safari Adventure

Veuillez entrer le nombre de cages :
>> 50

Safari Adventure comporte 50 cages


---

3. **[Prosit2](https://github.com/ranimchaffar/java/tree/prosit2)**  


   ### **PROSIT 2 : Création et gestion avancée d'un zoo et de ses animaux**

**Description** :  
**Contexte :**  
Dans le cadre de votre mission chez **ESPRIT TECH**, le chef de projet vous demande de poursuivre le développement du logiciel de gestion de zoo. L’objectif est d’introduire des classes spécifiques pour modéliser le zoo et ses animaux, et d’appliquer des concepts avancés de programmation orientée objet, tels que les constructeurs paramétrés et l’encapsulation.

---

### **Objectifs :**
1. **Créer deux classes principales** pour représenter un zoo et ses animaux, avec des propriétés spécifiques.
2. **Simplifier l’initialisation des objets** en utilisant des constructeurs paramétrés.
3. **Gérer les relations** entre le zoo et ses animaux via un tableau de taille fixe (25 animaux maximum).
4. **Améliorer l’affichage des informations** pour rendre les données lisibles et compréhensibles.
5. **Ajouter une méthode dédiée** pour afficher les détails du zoo.

---

### **Étapes de réalisation :**

#### **Instruction 5 : Création des classes `Zoo` et `Animal`**
- Création de deux classes principales avec les attributs suivants :
  - **Classe `Animal` :**
    - `String family` : Famille de l’animal.
    - `String name` : Nom de l’animal.
    - `int age` : Âge de l’animal.
    - `boolean isMammal` : Indique si l’animal est un mammifère.
  - **Classe `Zoo` :**
    - `Animal[] animals` : Tableau contenant les animaux (maximum 25).
    - `String name` : Nom du zoo.
    - `String city` : Ville où se trouve le zoo.
    - `int nbrCages` : Nombre de cages dans le zoo.
- Créer deux objets dans la méthode principale :
  - Un **animal**.
  - Un **zoo** avec des valeurs assignées.

#### **Instruction 6 : Utilisation des constructeurs paramétrés**
- Ajouter des **constructeurs paramétrés** dans les classes `Zoo` et `Animal` pour simplifier l’initialisation des objets.

#### **Instruction 7 : Gestion des relations entre zoo et animaux**
- Créer plusieurs objets `Animal` en utilisant les constructeurs et les ajouter au tableau `animals` du zoo.

#### **Instruction 8 : Ajout de la méthode `displayZoo()`**
- Implémenter une méthode `displayZoo()` dans la classe `Zoo` pour afficher les attributs (`name`, `city`, `nbrCages`).
- Appeler cette méthode dans la méthode principale (`main`).

#### **Instruction 9 : Affichage personnalisé des objets**
- Implémenter des méthodes dans les classes `Zoo` et `Animal` pour afficher directement les informations via des instructions adaptées.

---

### **Compétences développées :**
- Création et manipulation avancée de classes en Java.
- Utilisation de **constructeurs paramétrés** pour simplifier l’initialisation des objets.
- Gestion des relations entre objets à l’aide de tableaux.
- Encapsulation des attributs et amélioration de l’affichage des informations avec des méthodes dédiées.
- Application des bonnes pratiques de programmation orientée objet.

---

**Livrable final :**  
Un programme Java fonctionnel où :  
- Les informations des animaux et du zoo sont initialisées via des constructeurs paramétrés.  
- Les relations entre le zoo et ses animaux sont gérées efficacement via un tableau.  
- Les informations des objets `Zoo` et `Animal` sont affichées de manière lisible.
  Exemple d'un affichage attendu :
  Veuillez entrer les informations du zoo :
Nom du zoo : 
>> Safari Adventure
Ville du zoo : 
>> Nairobi
Nombre de cages : 
>> 30

Informations du zoo :
Nom : Safari Adventure
Ville : Nairobi
Nombre de cages : 30

Veuillez entrer les informations d’un animal :
Famille de l’animal : 
>> Félins
Nom de l’animal : 
>> Lion
Âge de l’animal : 
>> 5
Est-ce un mammifère ? (true/false) : 
>> true

Informations de l’animal :
Famille : Félins
Nom : Lion
Âge : 5
Mammifère : Oui

Informations du zoo via méthode `displayZoo()` :
Nom : Safari Adventure
Ville : Nairobi
Nombre de cages : 30

Informations du zoo via affichage direct :
Nom : Safari Adventure, Ville : Nairobi, Nombre de cages : 30

Informations de l’animal via affichage direct :
Famille : Félins, Nom : Lion, Âge : 5, Mammifère : Oui


--- 


4. **[Prosit3](https://github.com/ranimchaffar/java/tree/prosit3)**  
   - **Description** : Ajout des fonctionnalités principales du projet.

5. **[Prosit4](https://github.com/ranimchaffar/java/tree/prosit4)**  
   - **Description** : Optimisation des flux de données et gestion avancée.

6. **[Prosit5](https://github.com/ranimchaffar/java/tree/prosit5)**  
   - **Description** : Ce PROSIT présente des méthodes avancées pour améliorer les performances.

7. **[Prosit6](https://github.com/ranimchaffar/java/tree/prosit6)**  
   - **Description** : Étude approfondie des algorithmes utilisés dans le projet.

8. **[Prosit7](https://github.com/ranimchaffar/java/tree/prosit7)**  
   - **Description** : Ajout des fonctionnalités d’interaction utilisateur.

9. **[Prosit8](https://github.com/ranimchaffar/java/tree/prosit8)**  
   - **Description** : Étude de cas pratique pour appliquer les concepts appris.

10. **[Prosit9](https://github.com/ranimchaffar/java/tree/prosit9)**  
    - **Description** : Gestion des erreurs et validation des données.

11. **[Prosit10](https://github.com/ranimchaffar/java/tree/prosit10)**  
    - **Description** : Implémentation de tests finaux et corrections des bugs.

12. **[Prosit11](https://github.com/ranimchaffar/java/tree/prosit11)**  
    - **Description** : Améliorations finales et préparation pour la mise en production.

13. **[Prosit12](https://github.com/ranimchaffar/java/tree/prosit12)**  
    - **Description** : Finalisation et documentation complète du projet.

---

## Auteur

- **Nom** : Ranim Chaffar  
- **Contact** : Chaffar.ranim@esprit.tn

---

## Instructions

1. Naviguez vers les branches pour explorer les différents PROSITs.
2. Consultez les descriptions pour comprendre chaque étape du projet.
3. N’hésitez pas à apporter des modifications ou des améliorations si nécessaire.
 
 
