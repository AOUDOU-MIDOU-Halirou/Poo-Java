public class Camion extends Vehicule{
    // le variable de la classe
    private double chargeMax;
    // constructeur
    public Camion(String marque, int annee, int vitesseMax, double chargeMax){
        super(marque, annee, vitesseMax);
        this.chargeMax = chargeMax;
    }
    public double getChargeMax(){
        return chargeMax;
    }
    public void setChargeMax(double charge){
        this.chargeMax = charge;
    }
    @Override
    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("avec une charge maximal de " + chargeMax);
    }
    @Override
    public double calculeConsommation(){
        return (vitesseMax | 8) + (chargeMax * 0.05);
    }
}
