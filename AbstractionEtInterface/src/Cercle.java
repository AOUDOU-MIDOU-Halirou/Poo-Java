import java.lang.Math;
public class Cercle extends Forme{
    // l'attribut rayon
    double rayon;
    // le constructeur
    public Cercle(double rayon){
        this.rayon = rayon;
    }
    @Override
    public double calculerSurface(){
        return Math.PI * Math.pow(rayon, 2);
    }
}
