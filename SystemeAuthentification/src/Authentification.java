public abstract class Authentification {
    // l'attribut de la classe : un utilisateur
    protected String utilisateur;
    public boolean estConnect;
    // le constructeur
    public Authentification(String utilisateur, boolean estConnect){
        this.utilisateur = utilisateur;
        this.estConnect = false;
    }

    // les methodes de la classe
    public void login(){
        if(verifierIdentite()){
            estConnect= true;
            System.out.println("Vous êtes connecté");
        }
        else{
            System.out.println("Veuillez verifier vos identifiant");
        }
    };
    public void logout(){
        if(estConnect){
            estConnect = false;
            System.out.println(utilisateur + "est deconnecté (e)");
        }
        else{
            System.out.println("Cet utilisateur n'existe pas");
        }
    };

    // La methode abstract verifierIdentite qui permet verifier
    // si l'utilisateur est connect ou pas
    public abstract boolean verifierIdentite();
}
