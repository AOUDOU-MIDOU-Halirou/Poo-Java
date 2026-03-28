import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    // collection des etudiants
    List<Etudiant> etudiants = new ArrayList<>();
    // collection d'observateur
    List<Observer> observers = new ArrayList<>();

    // la methode notifier pour notifier les abonnées
    public void notifier(String message){
        observers.forEach(o ->o.update(message));
    }
    // methode ajouterEtudiant permet d'ajouter des etudiants a la liste et notifier tous les abonnes
    public void ajouterEtudiant(Etudiant e){
        etudiants.add(e);
        // Notifier les abonnés
        notifier("Nouvelle étudiant ajouté " + e.getNom());
    }

    // afficher tous les etudiants de la collection
    public void afficherTousLesEtudiants(){
        System.out.println("La liste des étudiants");
        for(Etudiant o :etudiants){
            System.out.println(o);
        }
    }

    // Afficher les etudiants admis
    public void afficherEtudiantsAdmis(){
        etudiants.stream()
                .filter(Etudiant::estAdmis)
                .forEach(System.out::println);
    }
    // Trier les etudiants par leurs nom
    public void trierParNom(){
        etudiants.stream()
                .map(Etudiant::getNom)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
    // Trier les etudiants par age
    public void trierParAge(){
        etudiants.stream()
                .map(Etudiant:: getAge)
                .sorted()
                .forEach(System.out::println);
    }

    // Trier les etudiant par leurs moyennes
    public void trierParMoyenne(){
        etudiants.stream()
                .map(Etudiant::getMoyenne)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }

    // Ajouter un abonné dans la liste des abonnées
    public void ajouterObserver(Observer o){
        observers.add(o);
    }
}
