public class CompteBancaire {
    int numeroCompte;
    private double solde = 0;
    public double deposer(double montant){
        solde = solde + montant;
        return solde;
    }
    public double retirer(double montant){
        if (solde >=montant){
            solde = solde - montant;
        }
        else{
            System.out.println("Votre solde est insuffisant.");
        }
        return solde;
    }
    public double getSolde(){
        return solde;
    }

}
