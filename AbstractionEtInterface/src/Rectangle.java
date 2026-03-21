public class Rectangle extends Forme{
    // les variables de la classe
    double longueur;
    double largeur;
    // le constructeur
    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }
    @Override
    public double calculerSurface(){
        return longueur * largeur;
    }
}
