public class Etudiant extends Personne{
    // le constructeur
    public Etudiant(String nom){
        super(nom);
    }
    public void etudier(){
        System.out.println("j'étudie.");
    }
    @Override
    public void sePresenter(){
        System.out.println("Je suis un etudiant.");
    }
}
