import java.util.Scanner;
public class ZooManagement
{

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Entrer zoo name");
        String zooName=scanner.nextLine();
        while(zooName.trim().isEmpty())
        {
            System.out.print("le continu est vide !Reessayez a entrer le nom du zoo");
         zooName=scanner.nextLine();
        }

        System.out.print("Entrer le nombre de cages ");
        while(!scanner.hasNextInt()){
            System.out.print("entrer le nombre de cages !");
            scanner.next();
        }
        int nbrCages = scanner.nextInt();
        System.out.println(zooName + "comporte"+nbrCages+"cages");


    }

}

