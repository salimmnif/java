package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {

    public int nbrCages;
    public String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Entrez le nom du zoo :");
            zoo.zooName = scanner.nextLine();
            if (zoo.zooName.isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide. Veuillez réessayer.");
                continue;
            }
            System.out.println("Entrez le nombre de cages :");
            try {
                zoo.nbrCages = scanner.nextInt();
                if (zoo.nbrCages <= 0) {
                    System.out.println(" un nombre positif pour le nombre de cages.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(" un entier valide pour le nombre de cages.");
            }
        }

        // Affichage des nouvelles valeurs
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");




        scanner.close();

        /*tn.esprit.gestionzoo.entities.Animal lion= new tn.esprit.gestionzoo.entities.Animal();
        lion.name ="mofasa";
        lion.age =10;
        lion.family="mamifere";
        lion.isMammal=true;

        tn.esprit.gestionzoo.entities.Zoo z = new tn.esprit.gestionzoo.entities.Zoo();
        z.name="myzoo";
        z.animals[0]=lion;
        z.city="la";
        z.nbrCages=25;

        System.out.println(z.name);
        System.out.println(z.animals[0].name);
        System.out.println(z.city);
        System.out.println(z.nbrCages);*/

        Animal animal=new Animal("tiggre",10,true,"mamifere");


        Zoo z2 = new Zoo("myzoo","city");
        z2.animals[0]=animal;
        //utilisant fct
        z2.displayZoo();

        /*utilisant overide*/
        System.out.println(z2);

        Animal animal2=new Animal("lion",10,true,"mamifere");
        Animal animal3=new Animal("Girafe",20,true,"mamifere");
        Animal animal4=new Animal("lion",20,true,"mamifere");



        Zoo z3=new Zoo("zooadd","la");
        z3.addAnimal(animal2);
        z3.addAnimal(animal3);
        z3.addAnimal(animal4);
        z3.addAnimal(animal);



        z3.removeAnimal(animal);
        z3.displayZoo();
        if (z3.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Le zoo n'est pas plein.");
        }


    }
}
