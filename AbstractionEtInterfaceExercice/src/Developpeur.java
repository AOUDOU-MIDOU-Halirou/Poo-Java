public class Developpeur extends Employe{
    public Developpeur(String nom, double salaire){
        super(nom, salaire);
    }
    @Override
    public double calculerSalaire(){
        return salaire *0.1;
    }
}
