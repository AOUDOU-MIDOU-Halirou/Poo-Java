public class Moto extends Vehicule{
    // le variable de la classe typeMoto (sport, route, etc)
    private String typeMoto;
    // le constructeur
    public Moto(String marque, int annee, int vitesseMax, String typeMoto){
        super(marque, annee, vitesseMax);
        this.typeMoto = typeMoto;
    }
    public String getTypeMooto(){
        return typeMoto;
    }
    public void setTypeMoto(String typeMoto){
        this.typeMoto = typeMoto;
    }
    @Override
    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("le type de moto est " + typeMoto);
    }
    @Override
    public double calculeConsommation(){
        return vitesseMax | 25;
    }
}
