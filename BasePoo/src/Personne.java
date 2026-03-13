public class Personne {
    String nom;
    int age;
    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    // la methode se presenter qui permet d'afficher les caracreristique d'une perosone
    public void sePresenter(){
        System.out.println("Bonjour je m'appelle, "+ nom + "et j'ai " + age + " ans.");
    }
}
