import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Authentification[] liste = new Authentification[3];
        liste[0] = new AuthentificationMotDePasse("Salma","salma123","salma123");
        liste[1] = new AuthentificationBiometrique("Abdoul Hamid","hamidbio","hamid123");
        liste[2] = new AuthentificationOTP("Minal", "minalot12","minalot12");
        for(Authentification b : liste){
            if(b.verifierIdentite()){
                System.out.println("la liste des personnes connecte ou non");
                b.login();
                b.logout();
                System.out.println("-------------------------------------------");
            }
        }
    }
}