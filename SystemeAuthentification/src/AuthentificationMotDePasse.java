import java.util.Scanner;
public class AuthentificationMotDePasse extends Authentification{
    // l'attribut de la classe motDePasse
    private String motDePasse;
    private String motDePasseAttendu;
    // le constructeur de la classe
    public AuthentificationMotDePasse(String utilisateur,String motDePasse,String motDePasseAttendu){
        super(utilisateur);
        this.motDePasse = motDePasse;
        this.motDePasseAttendu = motDePasseAttendu;
    }
    public String getMotDePasse(){
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse){
        this.motDePasse = motDePasse;
    }
    public String getMotDePasseAttendu(){
        return motDePasseAttendu;
    }
    public void setMotDePasseAttendu(String motDePasseAttendu){
        this.motDePasseAttendu = motDePasseAttendu;
    }
    // Definition de la methode abstract qui permet de verifier l'identite
    @Override
    public boolean verifierIdentite(){
       return motDePasse.equals(motDePasseAttendu);
    }

}
