public class Etudiant extends Personne{
    // les autres attribut a part les attributs de Personne
    private double moyenne;
    private String matricule;
    // le constructeur
    public Etudiant(String nom, int age, double moyenne, String matricule){
        super(nom, age);
        this.moyenne = moyenne;
        this.matricule = matricule;
    }
    // les getteurs et les setteurs
    public String getMatricule(){
        return matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }
    public double getMoyenne(){
        return moyenne;
    }
    public void setMoyenne(double moyenne){
        this.moyenne = moyenne;
    }
    // la redefinition de la methode de sePresenter
    @Override
    public void sePresenter(){
        System.out.println("Je me présente au nom de " + getNom() +" matricule"+ matricule + " agé de " + getAge() + " ans avec une moyenne de " + moyenne );

    }
    public boolean estAdmis(){
        if(moyenne >= 10){
            System.out.println("L'étudiant " + getNom()+ "est admis pour suivre des cours.");
        }
        return false;
    }
    // la methode toString
    public String toString(){
        return "l'étudiant " + getNom() + " de matricule " + matricule + " agé de " + getAge() + " avec une moyenne de " + moyenne;
    }
}
