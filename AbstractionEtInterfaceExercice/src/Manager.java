public class Manager extends Employe{
    // le constructeur
    public Manager(String nom, double salaire){
        super(nom, salaire);
    }
    @Override
    public double calculerSalaire(){
        return salaire * 0.15;
    }
}
