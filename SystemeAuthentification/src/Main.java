import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Authentification> liste = new ArrayList<Authentification>();
        AuthentificationMotDePasse utilisateur1 = new AuthentificationMotDePasse("Ali",true,"1234");
        liste.add(utilisateur1);
        for(Authentification b : liste){
            if(b.verifierIdentite()){
                System.out.println("Accès autorisé");
            }
        }
    }
}