public class Main {
    public static void main(String[] args) {
        Vehicule[] tableau = new Vehicule[3];
        tableau[0] = new Voiture("Toyota", 2019, 50,4);
        tableau[1] = new Camion("Renault", 2010, 100,90);
        tableau[2] = new Moto("volvo", 2025,90,"sporst");
        for(Vehicule v : tableau){
            v.afficheInfo();
            System.out.println("La consommation: " + v.calculeConsommation());
            System.out.println("----------------------------------------------------------------");
        }

    }
}