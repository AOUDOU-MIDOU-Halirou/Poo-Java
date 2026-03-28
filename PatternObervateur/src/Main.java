public class Main {
    public static void main(String[] args) {
        ChainYutube yutube = new ChainYutube();
        Abonne user1 = new Abonne("Salma");
        Abonne user2 = new Abonne("Abdoul-Hamid");
        Abonne user3 = new Abonne("Minal");
        user1.sabonner(yutube);
        yutube.ajouterObserver(user3);
        yutube.ajouterObserver(user2);
        yutube.notifier("Nouvelle vidéo : L'histoire du Niger.");
        yutube.retirerObserver(user1);
    }
}