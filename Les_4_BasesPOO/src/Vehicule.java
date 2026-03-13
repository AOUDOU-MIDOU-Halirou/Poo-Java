public abstract class Vehicule {
    protected String marque;
    protected int annee;
    protected int vitesseMax;
    // le constructeur de la classe abstract pour initialiser les variables de la classe
    public Vehicule(String marque, int annee, int vitesseMax){
        this.marque = marque;
        this.annee = annee;
        this.vitesseMax = vitesseMax;
    }
    // La methode afficheInfo permet d'afficher les informations d'un vehicule
    public void afficheInfo(){
        System.out.println("Le vehicule est une marque de " + marque + " cree en " + annee + " avec une vitesse maximale de "+ vitesseMax + " km/h");
    }
    // La methode calculerConsommation est une methode abstract qui permet de clculer la consommation d'un vehicule
    public abstract double calculeConsommation();
}
