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
    }
}
