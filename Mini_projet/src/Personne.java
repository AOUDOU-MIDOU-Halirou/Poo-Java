public abstract class Personne {
    // les variables de la classe abstract
    private String nom;
    private int age;
    // le constructeur
    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    // les getteurs et setteurs
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public abstract void sePresenter();
}
