import java.util.Scanner;
public class AuthentificationMotDePasse extends Authentification{
    // l'attribut de la classe motDePasse
    private String motDePasse;
    // le constructeur de la classe
    public AuthentificationMotDePasse(String utilisateur, boolean estConnect,String motDePasse){
        super(utilisateur, estConnect);
        this.motDePasse = motDePasse;
    }
    public String getMotDePasse(){
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse){
        this.motDePasse = motDePasse;
    }
    // Definition de la methode abstract qui permet de verifier l'identite
    @Override
    public boolean verifierIdentite(){
        Scanner nc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre mot de passe:");
        String motDePasseEntre = nc.nextLine();
        if(motDePasse == motDePasseEntre){
            return true;
        }
        return false;
    }
    @Override
    public void login(){
        if(verifierIdentite()){
            estConnect = true;
            System.out.println("Vous êtes connecté avec votre mot de passe.");
        }
        else{
            System.out.println("Votre mot de passe est incorrecte.");
        }

    }
    @Override
    public void logout(){
        if(estConnect){
            estConnect = false;
            System.out.println("Vous êtes deconnecté à votre lié à votre mot de passe.");
        }
        else{
            System.out.println("Ce mot de passe n'est pas lié à ce compte");
        }


    }

}
