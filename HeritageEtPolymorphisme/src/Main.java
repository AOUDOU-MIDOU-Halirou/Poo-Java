public class Main {
    public static void main(String[] args) {
        Personne etudiants = new Etudiant("Salma");
        etudiants.sePresenter();

        // paiement
        Paiement p1 = new CarteBancaire();
        Paiement p2 = new PayPal();
        Paiement p3 = new MobilMoney();
        p1.payer();
        p2.payer();
        p3.payer();
    }
}