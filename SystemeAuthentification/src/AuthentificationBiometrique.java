public class AuthentificationBiometrique extends Authentification{
    // les variables de la classe : empreiinte et empreinteAttendu
    private String empreinte;
    private String empreinteAttendu;
    // le constructeur de la classe
    public AuthentificationBiometrique(String utilisateur,String empreinte, String empreinteAttendu){
        super(utilisateur);
        this.empreinte = empreinte;
        this.empreinteAttendu = empreinteAttendu;
    }
    // les getteurs et les setteurs
    public String getEmpreinte(){
        return empreinte;
    }
    public void setEmpreinte(String empreinte){
        this.empreinte = empreinte;
    }
    public String getEmpreinteAttendu(){
        return empreinteAttendu;
    }
    public void setEmpreinteAttendu(String empreinteAttendu){
        this.empreinteAttendu = empreinteAttendu;
    }
    @Override
    public boolean verifierIdentite(){
        return empreinte.equals(empreinteAttendu);
    }
}
