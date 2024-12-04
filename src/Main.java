import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de la classe StudentManagement
        StudentManagement management = new StudentManagement();

        // Liste d'étudiants
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "Alice", 22));
        students.add(new Etudiant(2, "Bob", 20));
        students.add(new Etudiant(3, "Charlie", 23));

        // Afficher tous les étudiants
        System.out.println("Liste des étudiants :");
        management.displayStudents(students, System.out::println);

        // Afficher les étudiants ayant plus de 21 ans
        System.out.println("\nÉtudiants ayant plus de 21 ans :");
        management.displayStudentsByFilter(students, s -> s.getAge() > 21, System.out::println);

        // Retourner les noms des étudiants
        System.out.println("\nNoms des étudiants :");
        String names = management.returnStudentsNames(students, Etudiant::getNom);
        System.out.println(names);

        // Créer un nouvel étudiant
        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "David", 19));
        students.add(newStudent);
        System.out.println("\nÉtudiant ajouté : " + newStudent);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        List<Etudiant> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        sortedStudents.forEach(System.out::println);

        // Convertir en Stream
        System.out.println("\nConversion en Stream et affichage :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
