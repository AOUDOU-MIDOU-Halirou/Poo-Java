public class Main {
    public static void main(String[] args) {
        Personne  p1 = new Personne("Salma", 19);
        //p1.nom = "Ali";
        //p1.age = 24;
        p1.sePresenter();
        // Creer une voiture, accelerer 3 fois et la vitesse
        Voiture v1 = new Voiture();
        v1.marque = "Honda";
        v1.modele = "HY18";
        v1.vitesse = 20;
        v1.accelerer(3*10);
        v1.freiner(10);

        // Creer un compte ,ensuite faire un depot et un retraire
        CompteBancaire compte1 = new CompteBancaire();
        compte1.numeroCompte = 12345;
        compte1.deposer(500);
        compte1.retirer(200);
        //compte1.getSolde();
        System.out.println("Le solde du compte est : " + compte1.getSolde());
    }
}