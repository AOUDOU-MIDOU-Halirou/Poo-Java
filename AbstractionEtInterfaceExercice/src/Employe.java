public abstract class Employe {
    // Les attributs de la classe
    String nom;
    double salaire;
    public Employe(String nom, double salaire){
        this.nom = nom;
        this.salaire = salaire;
    }
    abstract double  calculerSalaire();
}
