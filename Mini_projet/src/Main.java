public class Main {
    public static void main(String[] args) {

        //Creation d'une instances GestionEtudiants
        GestionEtudiants gestionEtudiants = new GestionEtudiants();
        // Creation de quelques abonnés
        Abonne abonne = new Abonne("Ademin");
        Abonne secretaire = new Abonne("Secretaire");
        //  ajouter ces abonnées au gestionnaire
        gestionEtudiants.ajouterObserver(abonne);
        gestionEtudiants.ajouterObserver(secretaire);
        // Creation de plusieurs étudiants
        Etudiant etudiant1 = new Etudiant("Salma", 24,98,"SAM583029");
        Etudiant etudiant2 = new Etudiant("Abdou-Hamid",20,96,"ABM472956");
        EtudiantBoursier etudiant3 = new EtudiantBoursier("Minal",18,99,"MNM453617",2000);
        // Ajout de ces etudiants au gestionnaire
        gestionEtudiants.ajouterEtudiant(etudiant1);
        gestionEtudiants.ajouterEtudiant(etudiant2);
        gestionEtudiants.ajouterEtudiant(etudiant3);
        // Teste des fonctionnalites
        // Afficher tous les etudiants
        System.out.println("Affichez tous les étudiants.");
        gestionEtudiants.afficherTousLesEtudiants();
        // affiche les admis
        System.out.println("Affichez les étudiants admis.");
        gestionEtudiants.afficherEtudiantsAdmis();
        // trier par nom
        System.out.println("Trier les étudiants par les noms.");
        gestionEtudiants.trierParNom();
        // trier par age
        System.out.println("Trier les étudiants par leur âge.");
        gestionEtudiants.trierParAge();
        // trier par la moyenne
        System.out.println("Trier les étudiants par la moyenne.");
        gestionEtudiants.trierParMoyenne();
        // Presenter les membres
        System.out.println("Présentation des étudiants.");
        etudiant1.sePresenter();
        etudiant2.sePresenter();
        etudiant3.sePresenter();

    }

}