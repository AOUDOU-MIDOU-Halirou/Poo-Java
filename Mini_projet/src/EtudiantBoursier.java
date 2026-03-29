public class EtudiantBoursier extends Etudiant{
    // attribut supplimentaire
    private double montantBourse;
    // constructeur
    public EtudiantBoursier(String nom, int age, double moyenne, String matricule,double montantBourse){
        super(nom, age, moyenne,matricule);
        this.montantBourse = montantBourse;
    }
    // les getteurs et setteurs
    public double getMontantBourse(){
        return montantBourse;
    }
    public void setMontantBourse(double montantBourse){
        this.montantBourse = montantBourse;
    }
    // la methode sePresenter
    public void sePresenter(){
        System.out.println("Je me présente au nom de " + getNom() +" matricule "+ getMatricule() + " agé de " + getAge() + " ans avec une moyenne de " + getMoyenne() + " est boursier avec une somme mensuelle " + montantBourse );
    }

}
