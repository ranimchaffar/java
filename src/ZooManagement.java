import java.util.Scanner;
public class ZooManagement
{

    public static void main(String[] args)
    {
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


        ///creation d un aanimal lion

        Animal lion =new Animal("chaffar","lion",5,true);

        ///creationd un zoo

        Zoo myzoo =new Zoo("belvidere","Tunis",10);

        /// l ajout du lion

        myzoo.animals[0]=lion;

        ///affichage

        myzoo.displayZoo();

        System.out.println(myzoo.toString());
        System.out.println(lion);

    }

}

