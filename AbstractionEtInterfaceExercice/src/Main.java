public class Main {
    public static void main(String[] args) {
        Employe developpeur = new Developpeur("Abdoul Malik", 4000);
        Employe manager = new Manager("Sakira",7000);
        System.out.println("Le salaire d'un developpeur est: "+ developpeur.calculerSalaire());
        System.out.println("Le salaire d'un manager est: "+ manager.calculerSalaire());
    }
}