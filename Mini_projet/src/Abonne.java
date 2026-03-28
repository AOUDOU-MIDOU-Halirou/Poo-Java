public class Abonne implements Observer{
    // le nom des abonnes
    private String nom;
    // le constructeur
    public Abonne(String nom){
        this.nom = nom;
    }
    // les getters et setters
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    // implementation du contrat update de l'interface Observer
    public void update(String message){
       System.out.println("Admin a reçu : Nouvel étudiant ajouté : " + nom);
    }

}
