package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int MAX_CAGES = 25;

    public Zoo() {
        animals = new Animal[25];
    }
    public void setName(String name){
        if(name.length()<0)
        {System.out.println("Name cannot be less than 0 characters");}
        else {
            this.name = name;
        }

    }
    public void displayZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println("Max Cages: " + MAX_CAGES);

        for (int i = 0; i < this.MAX_CAGES; i++) {
            if (animals[i] != null) {
                animals[i].displayanimal();
            } else {
                System.out.println("Cage " + (i + 1) + ": No animal");
            }
        }
    }

    public  boolean addAnimal(Animal animal) {
        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("This animal is already in the zoo.");
            return false;
        }
        if(isZooFull())
            return false;


        for (int i = 0; i < this.MAX_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;



        }

    public boolean isZooFull() {
        int animalCount = 0;

        for (int i = 0; i < MAX_CAGES; i++) {
            if (animals[i] != null) {
                animalCount++;
            }
        }

        return animalCount == MAX_CAGES;
    }



    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index != -1) {
            animals[index] = null;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < this.MAX_CAGES; i++) {
            if (animals[i] != null) {
                animals[i].displayanimal();
        }

    }
    }

    public int searchAnimal(String animal) {
        int i =0;
        while ( i< animals.length )
        {
            if(animals[i]!=null && animals[i].getName().equals(animal)){
                return i;
            }

                i++;


        }
        return -1;
    }




    Zoo(String name,String city){
        this.name = name;
        this.city = city;
        animals = new Animal[MAX_CAGES];

    }

    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\n" +
                "Ville : " + city + "\n" +
                "Nombre de cages : " + MAX_CAGES;

    }

}
