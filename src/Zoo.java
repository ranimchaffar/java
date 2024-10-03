public class Zoo
{
    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES=25 ;
    static int nbranimals=0;

    public Zoo(String name, String city, int NBR_CAGES)
    {
        this.name = name;
        this.city = city;
        //this.NBR_CAGES = NBR_CAGES;
        this.animals = new Animal[NBR_CAGES];
    }

    public void displayZoo()
    {
        System.out.println(name + " " + city + " " + NBR_CAGES);
    }
//    @Override
//    public String toString()
//    {
//        return name + " " + city + " " + nbrCages;
//    }
    int searchAnimal(String name)
    {
        for (int i = 0; i < nbranimals; i++)
        {
            if(animals[i].name.equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal)
    {if(this.searchAnimal(animal.name)==-1 && nbranimals < NBR_CAGES)
     {
         this.animals[nbranimals] = animal;

         nbranimals++;

         return true;
     }
     return false;

    }
    boolean removeAnimal(Animal animal)
    {
        int index = searchAnimal(animal.name);
        if (index != -1) {
            for (int i = index; i < nbranimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbranimals - 1] = null;
            nbranimals--;
            return true;
    }
    return false;}
    public boolean isZooFull()
    {
        return nbranimals >= NBR_CAGES;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if(z1.nbranimals==z2.nbranimals)
            return this;
        else
            return z1.comparerZoo(z2, this);
    }



  /*  void displayAnimal()
    {
        
    }*/
}
