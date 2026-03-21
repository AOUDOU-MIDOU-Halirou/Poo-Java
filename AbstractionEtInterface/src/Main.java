public class Main {
    public static void main(String[] args) {
        Forme cercle = new Cercle(9);
        Forme rectangle = new Rectangle(7,4);
        System.out.println("La surface du cercle est: " + cercle.calculerSurface());
        System.out.println("La surface du rectangle est: " + rectangle.calculerSurface());
        System.out.println("----------------------------------------------");
        Vehicule voiture = new Vooiture();
        Vehicule moto = new Mooto();
        voiture.rouler();
        moto.rouler();
        System.out.println("----------------------------------------------");
        Oiseau oiseau = new Oiseau();
        oiseau.espece();
        oiseau.typeAnimal();
        oiseau.manger();
        oiseau.voler();

    }
}