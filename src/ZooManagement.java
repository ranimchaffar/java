import java.util.Scanner;
public class ZooManagement
{

    public static void main(String[] args)
    {
        /*Scanner scanner= new Scanner(System.in);
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
        */





        ///creationd un zoo

        Zoo myzoo =new Zoo("belvidere","Tunis",10);
        Zoo zazar =new Zoo("esprit","zarzis",4);

        /// l ajout du lion
        Animal lion =new Animal("chaffar","lion1",5,true);
        System.out.println(myzoo.addAnimal(lion));
        Animal lion9 =new Animal("chaffar","lion9",9,true);
        System.out.println(myzoo.addAnimal(lion9));
        Animal lion8 =new Animal("chaffar","lion8",8,true);
        System.out.println(myzoo.addAnimal(lion8));
        Animal lion7 =new Animal("chaffar","lion7",7,true);
        System.out.println(myzoo.addAnimal(lion7));
        Animal lion6 =new Animal("chaffar","lion6",6,true);
        System.out.println(myzoo.addAnimal(lion6));
        Animal lion5 =new Animal("chaffar","lion5",5,true);
        System.out.println(myzoo.addAnimal(lion5));


        Animal tigre = new Animal("tigra","baguira",5,true);
        System.out.println(myzoo.addAnimal(tigre));

        int index = myzoo.searchAnimal("Lion");
        System.out.println(index != -1 ? "Lion trouvé à l'index : " + index : "Lion non trouvé.");

        System.out.println(myzoo.removeAnimal(lion) ? "Lion supprimé." : "Lion non trouvé pour suppression.");
        Animal ours = new Animal("Ours","dabdoub",5,true);
        System.out.println(myzoo.addAnimal(ours));
        System.out.println(myzoo.comparerZoo(zazar,myzoo));
        ///affichage

        myzoo.displayZoo();





    }

}

