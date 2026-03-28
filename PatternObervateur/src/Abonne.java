public class Abonne implements Observer{

    // Le nom de l'abonné
    private String nom;
    // constructeur
    public Abonne(String nom){
        this.nom = nom;
    }
    // les getters et les setters
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    // la methode udate de l'interface qui permet de notifier les changement aux diffents abonnés
    public void update(String message){
        System.out.println(nom + " vous venez de recevoir une notification sur "+ message);
    }
    // un client peut s'abonner un chaine
    public void sabonner(ChainYutube chaine){
        chaine.ajouterObserver(this);
    }
    // un abonne peut se desabonner
    public void desabonner(ChainYutube chaine){
        chaine.retirerObserver(this);
    }

}
