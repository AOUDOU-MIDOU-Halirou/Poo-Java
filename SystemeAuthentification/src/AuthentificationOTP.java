public class AuthentificationOTP extends Authentification{
    // les attribut de la classe codeOTP et codeOTPAttendu;
    private String codeOTP;
    private String codeOTPAttendu;

    // le constructeur
    public AuthentificationOTP(String utilisateur, String codeOTP, String codeOTPAttendu){
        super(utilisateur);
        this.codeOTP = codeOTP;
        this.codeOTPAttendu = codeOTPAttendu;
    }
    // les getteurs et setteurs
    public String getCodeOTP(){
        return codeOTP;
    }
    public void setCodeOTP(String codeOTP){
        this.codeOTP = codeOTP;
    }
    public String getCodeOTPAttendu(){
        return codeOTPAttendu;
    }
    public void setCodeOTPAttendu(String codeOTPAttendu){
        this.codeOTPAttendu = codeOTPAttendu;
    }

    // Definition de la methode abstract
    @Override
    public boolean verifierIdentite(){
        return codeOTP.equals(codeOTPAttendu);
    }
}
