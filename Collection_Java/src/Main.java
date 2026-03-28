import java.util.*;

public class Main {
    public static void main(String[] args) {
// les des objets String qui accepte des doublons
        List<String> noms= new ArrayList<>();
        noms.add("Salma");
        noms.add("Saadiya");
        noms.add("Abdoul-Malik");
        noms.add("Bilal");
        noms.add("Abdoul-Raquib");
        noms.add("Abdoul-Hamid");
        noms.add("Minal");
        noms.add("Abdoul-Hamid");
        System.out.println("-----------Les elements de la liste de ArrayList------------.");
        for(String nom: noms){
            System.out.println(nom);
        }
        // Hashset liste des objets qui n'accepte pas les doublons
        Set<String> listes = new HashSet<>();
        listes.add("Hanane");
        listes.add("Amira");
        listes.add("Laïla");
        listes.add("Raya");
        listes.add("Hanane");
        System.out.println("-----------Les elements de la liste en HashSet------------.");
        for(String liste : listes){
            System.out.println(liste);
        }
        // listes des objets HashMap
        Map<String, Integer> noms_cles = new HashMap<>();
        noms_cles.put("Ali", 23);
        noms_cles.put("Toto",18);
        noms_cles.put("Messi",40);
        noms_cles.put("Halirou",30);
        System.out.println("------------Les elements cles valeurs -------------");
        System.out.println(noms_cles.get("Ali"));

        for(Map.Entry<String, Integer> nom : noms_cles.entrySet()){
            System.out.println(nom.getKey() + "----> " + nom.getValue());
        }

        // les elements de la liste etudiant
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Tata",12));
        etudiants.add(new Etudiant("Bob", 20));
        etudiants.add(new Etudiant("Alice", 25));
        etudiants.add(new Etudiant("Sara", 30));
        System.out.println("------------La liste des etudiants.-------------");
        for(Etudiant etude : etudiants){
            System.out.println("Nom: " + etude.getNom()+", Age: "+etude.getAge());
        }
        System.out.println("------------La liste des noms a supprimer les doublons.-------------");
        //  Liste des noms a supprimer les doubles
        ArrayList<String> liste_noms = new ArrayList<>();
        liste_noms.add("Ali");
        liste_noms.add("Sara");
        liste_noms.add("Moussa");
        liste_noms.add("Sara");
        List<String> liste_sans_doublons = liste_noms.stream()
                .distinct()
                .toList();
        liste_sans_doublons.forEach(nom ->System.out.println(nom));
        System.out.println("------------La liste des entiers.-------------");
        // le trie d'une liste d'entier
        List<Integer> liste_entier = List.of(1,4,6,75,5,3);
        List<Integer> liste_trie = liste_entier.stream()
                .sorted()
                .toList();
        liste_trie.forEach(entier -> System.out.println(entier));
        System.out.println("------------La liste des donnees  a traiter.-------------");
        // Liste de donne
        List<String> lnoms = List.of("Ali","Sara","Ali","Moussa","Amina");
        lnoms.stream()
                .filter(e ->e.startsWith("A"))
                .distinct()
                .sorted()
                .map(e ->e.toUpperCase())
                .forEach(System.out::println);
        System.out.println("------------La liste des etudiants.-------------");
        List<Etudiant> etudiantes = List.of(
                new Etudiant("Ali",19),
                new Etudiant("Sara", 25),
                new Etudiant("Moussa", 22),
                new Etudiant("Amina",18)
        );
        etudiantes.stream()
                .filter(e -> e.getAge() > 20)
                .map(nom ->nom.getNom())
                .sorted()
                .forEach(System.out::println);







    }
}