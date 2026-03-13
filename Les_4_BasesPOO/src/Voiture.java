public class Voiture extends Vehicule{
    private int nombrePortes;

    // le constructeur de la classe voiture
    public Voiture(String marque, int annee, int vitesseMax, int nombrePortes){
        super(marque, annee, vitesseMax);
        this.nombrePortes = nombrePortes;
    }
    @Override
    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("le nombre de portes est " + nombrePortes);
    }
    @Override
    public double calculeConsommation(){
        return vitesseMax | 15;
    }
    public double getNombrePortes(){
        return nombrePortes;
    }
    public void setNombrePortes(int nombre){
        this.nombrePortes = nombre;
    }
}
