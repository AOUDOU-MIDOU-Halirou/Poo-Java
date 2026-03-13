public class Voiture {
    String marque;
    String modele;
    int vitesse = 0;
    public void accelerer(int vitesse_v1){
        vitesse = vitesse + vitesse_v1;
        System.out.println("la vitesse est :" + vitesse);
    }
    public void freiner(int decelerer){
        vitesse -= decelerer;
        System.out.println("la vitesse a diminue : " + vitesse);
    }
}
